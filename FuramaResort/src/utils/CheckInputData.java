package utils;

import java.time.LocalDate;
import java.time.Period;
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
    public static String checkInputSex(String message) {
        while (true) {
            System.out.println(message);
            String sex = scanner.nextLine();
            if(sex.equalsIgnoreCase("Nam") || sex.equalsIgnoreCase("Nu")) {
                return sex;
            } else {
                System.out.println("Sex phải là nam hoặc nu.");
            }
        }
    }

    public static String checkInputLevel(String message) {
        while (true) {
            System.out.println(message);
            String level = scanner.nextLine();
            if(level.equalsIgnoreCase("Trung cap") || level.equalsIgnoreCase("Cao dang") || level.equalsIgnoreCase("Dai học") || level.equalsIgnoreCase("Sau dai học")) {
                return level;
            } else {
                System.out.println("Trình độ phải là Trung cap,Cao dang,Dai hoc hoặc Sau dai học.Vui lòng nhập laị");
            }
        }
    }

    public static String checkInputPosition(String message) {
        while (true) {
            System.out.println(message);
            String position = scanner.nextLine();
            if(position.equalsIgnoreCase("Le tan") || position.equalsIgnoreCase("Phuc vu") || position.equalsIgnoreCase("Chuyen vien") || position.equalsIgnoreCase("Giam sat") || position.equalsIgnoreCase("Quan li") || position.equalsIgnoreCase("Giam doc")) {
                return position;
            } else {
                System.out.println("Vị trí phải là Le tan, Phuc vu, Chuyen Vien, Giam Sat, Quan Li, Giam Doc. Vui lòng nhập lại.");
            }
        }
    }
    public static String checkInputNull(String message, String warn) {
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if(result.length() == 0 || result == null) {
                System.out.println(warn + "không hợp lệ.Vui lòng nhập lại.");
            }
        }
    }




    public static double checkInputMoney(String message, double min) {
        while (true) {
            try {
                System.out.println(message);
                double money = Double.parseDouble(scanner.nextLine());
                if (money < min ) {
                    System.out.printf("Tiền phải là số tiền lớn hơn %d", min);
                    continue;
                }
                return money;
            } catch (Exception e) {
//                System.out.println(e.getMessage());
                System.out.println("Tiền phải là số.");
            }
        }
    }

    public static float checkInputArea(String message, float min ) {
        while (true) {
            try {
                System.out.println(message);
                float area = Float.parseFloat(scanner.nextLine());
                if (area < min) {
                    System.out.printf("Diện tích phải lớn hơn %d m2", min );
                    continue;
                }
                return area;
            } catch (Exception e) {
                System.out.println("Diện tích phải là số.");
            }
        }
    }

    public static int checkInputPeople(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int people = Integer.parseInt(scanner.nextLine());
                if(people <= min || people >= max ) {
                    System.out.printf("Số lượng người phải nằm trong khoảng từ %d đến %d người.", min, max);
                    continue;
                }
                return people;
            } catch (Exception e) {
                System.out.println("Số người phải là số.");
            }

        }
    }
    public static int checkInputFloor(String message, int min) {
        while (true) {
            try {
                System.out.println(message);
                int floor = Integer.parseInt(scanner.nextLine());
                if(floor <= min) {
                    System.out.printf("Số tầng phải lớn hơn %d", min);
                    continue;
                }
                return floor;
            } catch (Exception e) {
                System.out.println("Số tầng phải là số.");
            }
        }
    }

}
