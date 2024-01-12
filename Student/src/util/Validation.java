package util;

import model.Student;
import repository.IStudentRepository;
import repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class Validation {
    private static IStudentRepository studentRepository = new StudentRepository();

    private static Scanner scanner = new Scanner(System.in);

    public static boolean checkId(int idCheck) {
        List<Student> studentList = studentRepository.getList();
        for (Student s : studentList) {
            if (s.getId() == idCheck) {
                System.out.println("Id đã trùng.Vui lòng nhập lại.");
                return false;
            }

        }
        return true;
    }
    public static boolean confirm(String mess) {
        while (true) {
            System.out.println(mess);
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("Y")) {
                return true;
            } else if (option.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Bạn phải nhập Y hoặc N");
            }
        }
    }
}
