package comtroller;

import service.HotelService;
import service.IHotelService;
import util.CheckInputData;

import java.util.Scanner;

public class HotelController {
    private static IHotelService hotelService = new HotelService();
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.Adding new hotel.");
            System.out.println("2.Checking exits Hotel.");
            System.out.println("3.Updating Hotel information.");
            System.out.println("4.Deleting Hotel.");
            System.out.println("5.Searching Hotel.");
            System.out.println("6.Displaying a hotel list.");
            System.out.println("7.Quit.");
            int choice = CheckInputData.CheckInputOption("Chọn chức năng:", 1, 7);
            switch (choice) {
                case 1: {
                    hotelService.addHotel();
                    break;
                }
                case 2: {

                }
                case 3: {
                    String hotel_idedit = HotelController.editByHotel_id();
                    hotelService.updateHotel(hotel_idedit);
                    break;

                }
                case 4: {
                    String hotel_iddel = CheckInputData.checkInputNull("Nhập id hotel cần xóa:", "Id hotel");
                    hotelService.removeHotel(hotel_iddel);
                    break;
                }
                case 5: {

                }
                case 6: {
                    hotelService.displayHotel();
                    break;


                }
                default: {
                    flag = false;
                }

            }
        } while (flag);
    }
    public static String editByHotel_id() {
        return CheckInputData.checkInputNull("Nhập id hotel cần chỉnh sửa:", "Id hotel");
    }
}
