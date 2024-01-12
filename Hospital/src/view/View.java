package view;

import controller.BenhAnController;
import util.CheckInputData;

import java.util.Scanner;

public class View {
    private static final int ADD = 1;
    private static final int DELETE = 2;
    private static final int DISPLAY = 3;

    private static BenhAnController benhAnController = new BenhAnController();
    private static View view = new View();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chương trình quản lí bệnh nhân.");
            Menu.showMenu();
            int choice = CheckInputData.checkInputOption("Mời bạn nhập chức năng:", 1, 4);
            switch (choice) {
                case ADD : {
                    benhAnController.addBenhAn();
                    break;
                }
                case DELETE: {
                    int maDel = view.deletebyMa();
                    benhAnController.

                }
                case DISPLAY: {

                }
                default: {
                    flag = false;
                }
            }

        } while (flag);

    }
    public int deletebyMa() {
        return
    }
}
