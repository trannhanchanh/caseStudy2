package util;

import java.util.Scanner;

public class CheckInputData {
  private static Scanner scanner = new Scanner(System.in);

  public static int checkInputOption(String message, int min, int max) {
     while (true) {
       try {
         System.out.println(message);
         int option = Integer.parseInt(scanner.nextLine());
         if (option < min || option > max) {
             System.out.printf("Option phải nằm trong khoảng %d đến %d", min , max);
             continue;
         }
         return option;
       } catch (Exception e) {
           System.out.println("Option phải là số.");
       }
     }
  }

  private static int checkInputMa
}
