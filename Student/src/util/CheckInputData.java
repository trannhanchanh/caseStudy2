package util;

import java.util.Scanner;

public class CheckInputData {
    private static Scanner scanner = new Scanner(System.in);
    private static final String DATEOFBIRTH_VALID = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[012])\\/\\d{4}$";
    private static final String EMAIL_VALID = "^[a-zA-z0-9]+@gmail.com";
    public static String checkInputDateOfBirth(String message) {
        while (true) {
            System.out.println(message);
            String dateOfBirth = scanner.nextLine();
            if(dateOfBirth.matches(DATEOFBIRTH_VALID)) {
                return dateOfBirth;
            } else {
                System.out.println("Ngày không hợp lệ.Vui lòng nhập lại.");
            }
        }
    }
    public static String checkInputEmail(String message) {
        while (true) {
            System.out.println(message);
            String email = scanner.nextLine();
            if(email.matches(EMAIL_VALID)) {
                return email;
            } else {
                System.out.println("Email không hợp lệ.Vui lòng nhập lại.");
            }
        }
    }

    public static int checkInputId(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int id = Integer.parseInt(scanner.nextLine());
                if (id < min || id > max) {
                    System.out.printf("Id phải nằm trong khoảng %d đến %d", min, max);
                    continue;
                }
                return id;
            } catch (Exception e) {
                System.out.println("Id phải là số.");
            }
        }
    }

    public static String checkInputName(String message) {
        while (true) {
            System.out.println(message);
            String name = scanner.nextLine();
            if (name.length() == 0 || name == null) {
                System.out.println("Tên không được để trống.");
                continue;
            }
            return name;
        }
    }

    public static double checkInputMark(String message, double min, double max) {
        while (true) {
            try {
                System.out.println(message);
                double mark = Double.parseDouble(scanner.nextLine());
                if (mark < min || mark > max) {
                    System.out.printf("Điểm phải nằm trong khoảng %d đến %d", min, max);
                    continue;
                }
                return mark;
            } catch (Exception e) {
                System.out.println("Điểm phải là số.");
            }
        }
    }

    public static int checkInputOption(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int option = Integer.parseInt(scanner.nextLine());
                if (option < min || option > max) {
                    System.out.printf("Option phải từ %d đến %d", min, max);
                    continue;
                }
                return option;
            } catch (Exception e) {
                System.out.println("Option phải là số.");
            }
        }
    }
}
