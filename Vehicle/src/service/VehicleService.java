package service;

import model.*;
import repository.IVehicleRepository;
import repository.VehicleRepository;
import util.CheckInputData;
import util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService implements IVehicleService {
    Scanner scanner = new Scanner(System.in);
    private static IVehicleRepository vehicleRepository = new VehicleRepository();
    private static final String BIENSOXE_TRUCK_VALID = "^(43C)-\\d{3}.\\d{2}$";
    private static final String BIENSOXE_CAR_VALID = "^(43)[AB]-\\d{3}.\\d{2}$";
    private static final String BIENSOXE_MOTORBIKE_VALID = "^(43)-[A-Z][A-Z0-9]-[0-9][0-9][0-9].[0-9][0-9]";
    private static final String NAME_VALID = "^([A-Z][a-z]{1,})((\\s[A-Z][a-z]{1,}){1,})$";

    @Override
    public void addVehicle() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng thêm mới phương tiện:");
            System.out.println("1.Thêm xe tải.");
            System.out.println("2.Thêm ô tô.");
            System.out.println("3.Thêm xe máy.");
            System.out.println("4.Back to menu.");
            int choice = CheckInputData.CheckInputOption("Mời bạn nhập chức năng thêm:", 1, 4);
            switch (choice) {
                case 1: {
                    addTruck();
                    break;
                }
                case 2: {
                    addCar();
                    break;
                }
                case 3: {
                    addMotorbike();
                    break;
                }
                default: {
                    flag = false;

                }
            }
        } while (flag);

    }

    @Override
    public void displayVehicle() {
        List<Vehicle> vehicleList = vehicleRepository.getList();
        for (Vehicle v : vehicleList) {
            System.out.println(v.getInfoToCSV());
        }
    }

    @Override
    public void removeVehicle(String bienKiemSoatdel) {
        List<Vehicle> vehicleList = vehicleRepository.getList();
        List<String> stringList = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getBienKiemSoat().equals(bienKiemSoatdel)) {
                flag = true;
                System.out.println("Đã tìm thây biển kiêm sáot tươnguwns");
                String mess = "Bạn có muốn chắc chắn xóa không?(Y/N)";
                if (Validation.confirm(mess)) {
                    vehicleList.remove(i);
                    vehicleRepository.update(vehicleList);
                    System.out.println("Đã xoa thành công!!!");
                    return;
                }
            }
        }

        if (!flag) {
            System.out.println("Không tìm thấy biển số xe.");
        }
    }

    public void addTruck() {
        while (true) {
            String bienKiemSoat = CheckInputData.checkInput("Mời bạn nhập biển số xe:", BIENSOXE_TRUCK_VALID, "Biển số xe không hợp lệ.Vui lòng nhập lại.");
            displayHangSanXuat();
            String hangSanXuat = CheckInputData.checkInputNull("Mời bạn nhập hãng sản xuất:", "Hãng sản xuất");
            int namSanXuat = CheckInputData.checkInputInt("Mời bạn nhập năm sản xuất:", 0);
            String chuSoHuu = CheckInputData.checkInput("Mời bạn nhập tên chủ sở xe :", NAME_VALID, "Tên chủ sở hữu không tồn tại.Vui lòng nhập lại.");
            double trongTai = CheckInputData.checkInputDouble("Mời bạn nhập trọng tải của xe:", 0, "Trọng tải");
            Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
            vehicleRepository.addVehicle(truck);
            System.out.println("Đã thêm thành công.");

            String mess = "Bạn có muốn thêm nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }

    }

    public  void addCar() {
        while (true) {
            String bienKiemSoat = CheckInputData.checkInput("Mời bạn nhập biển số xe:", BIENSOXE_CAR_VALID, "Biển số xe không hợp lệ.Vui lòng nhập lại.");
            String hangSanXuat = CheckInputData.checkInputNull("Mời bạn nhập hãng sản xuất:", "Hãng sản xuất");
            int namSanXuat = CheckInputData.checkInputInt("Mời bạn nhập năm sản xuất:", 0);
            String chuSoHuu = CheckInputData.checkInput("Mời bạn nhập tên chủ sở xe :", NAME_VALID, "Tên chủ sở hữu không tồn tại.Vui lòng nhập lại.");
            int soChoNgoi = CheckInputData.checkInputSoChoNgoi("Mời bạn nhập số chỗ ngồi của xe:", 0);
            String typeCar = CheckInputData.checkInputTypeCar("Mời bạn nhập kiểu xe:");
            Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, typeCar);
            vehicleRepository.addVehicle(car);
            System.out.println("Đã thêm thành công.");
            String mess = "Bạn có muốn thêm nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }

    public  void addMotorbike() {
        while (true) {
            String bienKiemSoat = CheckInputData.checkInput("Mời bạn nhập biển số xe:", BIENSOXE_MOTORBIKE_VALID, "Biển số xe không hợp lệ.Vui lòng nhập lại.");
            String hangSanXuat = CheckInputData.checkInputNull("Mời bạn nhập hãng sản xuất:", "Hãng sản xuất");
            int namSanXuat = CheckInputData.checkInputInt("Mời bạn nhập năm sản xuất:", 0);
            String chuSoHuu = CheckInputData.checkInput("Mời bạn nhập tên chủ sở xe :", NAME_VALID, "Tên chủ sở hữu không tồn tại.Vui lòng nhập lại.");
            double congSuat = CheckInputData.checkInputDouble("Mời bạn nhập công suất của xe:", 0, "Công suất");
            Motorbike motorbike = new Motorbike(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
            vehicleRepository.addVehicle(motorbike);
            System.out.println("Đã thêm thành công.");
            String mess = "Bạn có muốn thêm nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }
    }

    public void displayHangSanXuat() {
        List<HangSanXuat> hangSanXuatList = vehicleRepository.getListHangSanXuat();
        for (HangSanXuat hsx : hangSanXuatList) {
            System.out.println(hsx.toString());
        }
    }


}
