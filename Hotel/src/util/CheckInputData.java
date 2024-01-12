package util;

import java.util.Scanner;

public class CheckInputData {
    private static Scanner scanner = new Scanner(System.in);
    public static int CheckInputOption(String message, int min, int max) {
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

    public static String checkInputNull(String message, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.trim().isEmpty()) {
                System.out.println(warn + "không được để trống.");
                continue;
            }
            return result;
        }
    }

    public static int checkInputInt(String message, int min, String warn) {
        while (true) {
            try {
                System.out.println(message);
                int result = Integer.parseInt(scanner.nextLine());
                if (result < min) {
                    System.out.printf( warn + "phải nằm số lớn hơn %d", min);
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.out.println( warn + "phải là số.");
            }
        }
    }

    public static String checkInput(String message, String rerex, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.matches(rerex)) {
                return result;
            } else {
                System.out.println(warn);
            }
        }
    }

}
