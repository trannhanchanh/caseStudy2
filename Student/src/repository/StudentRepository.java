package repository;


import model.Student;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private final String FILE_PATH = "D:\\Code\\Java\\Codegym\\Student\\src\\data\\student.csv";
    private ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public List<Student> getList() {
        List<String> stringList = readAndWriteFile.readFromFile(FILE_PATH);
        List<Student> studentList = new ArrayList<>();
        String[] array = null;
        for (String s: stringList) {
            array = s.split(";");
            int id = Integer.parseInt(array[0]);
            String name = array[1];
            double mark = Double.parseDouble(array[2]);
            String capacity = array[3];
            String dateofBirth = array[4];
            String email = array[5];
            Student student = new Student(id, name, mark, capacity, dateofBirth, email);
            studentList.add(student);
        }
        return studentList ;
    }

    @Override
    public void addStudent(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAndWriteFile.writeToFile(FILE_PATH, stringList, true);
    }

    @Override
    public void deleteStudent(List<String> stringList) {
        readAndWriteFile.writeToFile(FILE_PATH, stringList, false);
    }

    @Override
    public void editStudent(List<String> stringList) {
        readAndWriteFile.writeToFile(FILE_PATH, stringList, false);
    }
}
