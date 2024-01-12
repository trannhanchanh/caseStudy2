package controller;

import service.*;
import utils.CheckInputData;

import java.util.Scanner;

import static service.EmployeeService.ID_EMPLOYEE_VALID;

public class FuramaController {
    private static FuramaController furamaController = new FuramaController();
    private static IBookingService bookingService = new BookingService();
    private static IContractService contractService = new ContractService();
    private static ICustomerService customerService = new CustomerService();
    private static IEmployeeService employeeService = new EmployeeService();
    private static IFacilityService facilityService = new FacilityService();
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management.");
            System.out.println("6.Exit");
            int choice = CheckInputData.CheckInputOption("Mời bạn nhập chức năng để lựa chọn:", 1, 6);
            switch (choice) {
                case 1: {
                    menuEmployee();
                    break;
                }
                case 2: {
                    menuCustomer();
                    break;
                }
                case 3: {
                     menuFacility();
                     break;
                }
                case 4: {
                     menuBooking();
                     break;
                }
                case 5: {
                     menuPromtion();
                     break;
                }
                default: {
                    flag = false;
                }

            }
        } while (flag);
    }

    public static void menuEmployee() {
        boolean flag = true;
        do {
            System.out.println("1.Display list employees.");
            System.out.println("2.Add new employee.");
            System.out.println("3.Edit employee.");
            System.out.println("4.Remove employee.");
            System.out.println("5.Return main menu.");
            int choiceEmployee = CheckInputData.CheckInputOption("Mời bạn nhập chức năng của Employee:", 1, 5);
            switch (choiceEmployee) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                     employeeService.add();
                     break;
                }
                case 3: {
                    String idEdit = furamaController.editById();
                    employeeService.edit(idEdit);
                    break;
                }
                case 4: {
                    String idDel = furamaController.deleteById();
                    employeeService.delete(idDel);
                    break;
                }
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void menuCustomer() {
        boolean flag = true;
        do {
            System.out.println("1.Display list customers.");
            System.out.println("2.Add new customer.");
            System.out.println("3.Edit customer.");
            System.out.println("4.Return main menu.");
            int choiceCustomer = CheckInputData.CheckInputOption("Mời bạn nhập chức năng của Customer:", 1, 4);
            switch (choiceCustomer) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.add();
                    break;
                }
                case 3: {

                }
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void menuFacility() {
        boolean flag = true;
        do {
            System.out.println("1.Display list facility.");
            System.out.println("2.Add new facility.");
            System.out.println("3.Display list facility maintenance.");
            System.out.println("4.Return main menu.");
            int choiceFacility = CheckInputData.CheckInputOption("Mời bạn nhập chức năng của Customer:", 1, 4);
            switch (choiceFacility) {
                case 1: {
                    facilityService.display();
                    break;
                }
                case 2: {
                    facilityService.add();
                    break;

                }
                case 3: {

                }
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void menuBooking() {
        boolean flag = true;
        do {
            System.out.println("1.Add new booking.");
            System.out.println("2.Display list booking.");
            System.out.println("3.Create new contracts.");
            System.out.println("4.Display list contracts.");
            System.out.println("5.Edit contracts.");
            System.out.println("4.Return main menu.");
            int choiceBooking = CheckInputData.CheckInputOption("Mời bạn nhập chức năng của Customer:", 1, 6);
            switch (choiceBooking) {
                case 1: {
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void menuPromtion() {
        boolean flag = true;
        do {
            System.out.println("1.Display list customers use service.");
            System.out.println("2.Display list customers get voucher.");
            System.out.println("3.Return main menu.");
            int choicePromotion = CheckInputData.CheckInputOption("Mời bạn nhập chức năng của Customer:", 1, 3);
            switch (choicePromotion) {
                case 1: {
                }
                case 2: {

                }
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }
    public String editById() {
        return CheckInputData.checkInput("Nhập id của Employee cần sửa:", ID_EMPLOYEE_VALID, "Id không tồn tại.Mời bạn nhập lại.");
    }

    public String deleteById() {

        return CheckInputData.checkInput("Nhập id của Employee cần xóa:", ID_EMPLOYEE_VALID, "Id không tồn tại.Mời bạn nhập lại.");
    }



}
