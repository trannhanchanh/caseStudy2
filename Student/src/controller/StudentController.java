package controller;

import service.IStudentService;
import service.StudentService;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    public void addStudent() {
        studentService.addStudent();
    }
    public void displayStudent() {
        studentService.displayStudent();
    }

    public void deleteStudent(int idDel) {
        studentService.deleteStudent(idDel);
    }
    public void findStudent(String nameFind) {
        studentService.findStudent(nameFind);
    }
    public void editStudent(int idEdit) {
        studentService.editStudent(idEdit);
    }
}
