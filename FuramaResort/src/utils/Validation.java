package utils;

import model.person.Employee;
import repository.EmployeeRepository;
import repository.IEmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class Validation {
  private static IEmployeeRepository employeeRepository = new EmployeeRepository();
  private static Scanner scanner = new Scanner(System.in);


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
