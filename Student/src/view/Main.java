package view;

import controller.StudentController;
import util.CheckInputData;
import util.Validation;

import java.util.Scanner;

public class Main {
    private static final int DISPLAY = 1;
    private static final int ADD = 2;
    private static final int DELETE = 3;
    private static final int EDIT = 4;
    private static final int FIND = 5;
    private static Main main = new Main();
    private static StudentController studentController = new StudentController();
    private static Validation validation = new Validation();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chương trình quản lí sinh viên:");
            Menu.showMenu();
            int choice = CheckInputData.checkInputOption("\nMời bạn chọn chức năng", 1, 6);
            switch (choice) {
                case DISPLAY : {
                    studentController.displayStudent();
                    break;
                }
                case ADD: {
                    studentController.addStudent();
                    break;
                }
                case DELETE: {
                    int idDel = main.deleteById();
                    studentController.deleteStudent(idDel);
                    break;
                }
                case EDIT: {
                    int idEdit = main.editById();
                    studentController.editStudent(idEdit);
                    break;
                }
                case FIND: {
                    String nameFind = main.findByName();
                    studentController.findStudent(nameFind);
                    break;

                }
                default: {
                    flag = false;
                }
            }

        } while (flag);


    }
    public  int deleteById() {
        return CheckInputData.checkInputId("Nhập id sinh viên cần xóa:", 1, 100);
    }

    public String findByName() {
        return CheckInputData.checkInputName("Nhập tên sinh viên cần tìm: ");
    }
    public int editById() {
        return CheckInputData.checkInputId("Nhập id sinh viên cần sửa:", 1, 100);
    }
}
