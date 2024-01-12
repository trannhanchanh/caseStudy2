package service;

import model.Student;
import repository.IStudentRepository;

import repository.StudentRepository;
import util.CheckInputData;
import util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {

    private static IStudentRepository studentRepository = new StudentRepository();
    private static Student student = new Student();
    @Override
    public void editStudent(int idEdit) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = studentRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == idEdit) {
                flag = true;
                System.out.println("Đã tìm thấy sinh viên.");
                while (true) {
                System.out.println("1.Sửa tên sinh viên.");
                System.out.println("2.Sửa điểm sinh viên.");
                System.out.println("3.Sửa năng lực sinh viên.");
                System.out.println("4.Sửa ngày sinh của sinh viên.");
                    System.out.println("5.Sửa email của sinh viên.");
                int option = CheckInputData.checkInputOption("\nMời bạn nhập thông tin cần sửa: " , 1, 5);
                switch (option) {
                    case 1: {
                        studentList.get(i).setName(CheckInputData.checkInputName("Mời bạn nhập tên mới"));
                        break;
                    }
                    case 2: {
                        studentList.get(i).setMark(CheckInputData.checkInputMark("Mời bạn nhập điểm mới", 1.0, 10.0));
                        break;
                    }
                    case 3: {
                        System.out.println("Mời bạn nhâp năng lực mới:");
                        studentList.get(i).setCapacity(scanner.nextLine());
                        break;
                    }
                    case 4: {
                        studentList.get(i).setDateofBirth(CheckInputData.checkInputDateOfBirth("Mời bạn nhập ngày sinh mới:"));
                        break;
                    }
                    case 5: {
                        studentList.get(i).setEmail(CheckInputData.checkInputEmail("Mời bạn nhập email mới:"));
                    }
                }
                    System.out.println("Đã chỉnh sửa thành công.");
                    String mess = "Bạn có muốn sửa thêm thông tin nào nữa không(Y/N)?";
                    if (Validation.confirm(mess)) {
                        continue;
                    } else {
                        break;
                        // return là kêết thúc toàn bộ hàm.
                    }
                }
            }
        }
        for (Student s: studentList) {
            stringList.add(s.getInfoToCSV());
        }
        studentRepository.editStudent(stringList);
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int id;
            while (true) {
                id = CheckInputData.checkInputId("Mời bạn nhập id sinh viên:", 1, 100);
                if (Validation.checkId(id)) {
                    break;
                }
            }
            String name = CheckInputData.checkInputName("Mời bạn nhập tên sinh viên:");
            double mark = CheckInputData.checkInputMark("Mời bạn nhập điểm của sinh viên:", 1.0, 10.0);
            System.out.println("Mời bạn nhập năng lực sinh viên:");
            String capacity = scanner.nextLine();
            String dateOfBirth = CheckInputData.checkInputDateOfBirth("Mời bạn nhập ngày sinh của sinh viên:");
            String email = CheckInputData.checkInputEmail("Mời bạn nhập email của sinh viên:");
            Student student = new Student(id, name, mark, capacity, dateOfBirth, email);
            studentRepository.addStudent(student);
            System.out.println("Đã thêm thành công.");

            String mess = "Bạn có mốn nhập nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }

    @Override
    public void displayStudent() {
        List<Student> studentList = studentRepository.getList();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void deleteStudent(int idDel) {
        List<Student> studentList = studentRepository.getList();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() != idDel) {
                stringList.add(studentList.get(i).getInfoToCSV());
            }
        }
        studentRepository.deleteStudent(stringList);
        if (studentList.size() != stringList.size()) {
            System.out.println("Đã xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên tương ứng.");
        }

    }

    @Override
    public void findStudent(String nameFind) {
        boolean flag = false;
        List<Student> studentList = studentRepository.getList();
        for (Student s : studentList) {
            if (s.getName().contains(nameFind)) {
                flag = true;
                System.out.println("Đã tìm thấy sinh viên.");
                System.out.println(s);
                break;
            }

        }
        if (!flag) {
            System.out.println("Không tìm thấy tên sinh viên");
        }
    }


}
