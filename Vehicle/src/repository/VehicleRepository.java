package repository;

import model.*;
import util.ReadAndWriteFileToCSV;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository{
    private static ReadAndWriteFileToCSV readAndWriteFileToCSV = new ReadAndWriteFileToCSV();
    private final String HANGSANXUAT_DATA = "D:\\Code\\Java\\Codegym\\Vehicle\\src\\data\\hangSanXuat.csv";
    private final String VEHICLE_DATA = "D:\\Code\\Java\\Codegym\\Vehicle\\src\\data\\vehicle.csv";

    @Override
    public void addVehicle(Vehicle vehicle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(vehicle.getInfoToCSV());
        ReadAndWriteFileToCSV.writeToFile(VEHICLE_DATA, stringList, true);
    }

    @Override
    public List<Vehicle> getList() {
        List<String> stringList = readAndWriteFileToCSV.readFileCSV(VEHICLE_DATA);
        List<Vehicle> vehicleList = new ArrayList<>();
        String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            if(array[0].contains("43C")) {
                String bienKiemSoat = array[0];
                String tenhangSanXuat = array[1];
                int namSanXuat = Integer.parseInt(array[2]);
                String chuSoHuu = array[3];
                double trongtai = Double.parseDouble(array[4]);
//                String bienKiemSoat, String tenhangSanXuat, int namSanXuat, String chuSoHuu, double trongtai
                Vehicle vehicle = new Truck(bienKiemSoat,tenhangSanXuat,namSanXuat,chuSoHuu,trongtai);
                vehicleList.add(vehicle);
            } else if(array[0].contains("43A") || array[0].contains("43B")) {
                String bienKiemSoat = array[0];
                String tenhangSanXuat = array[1];
                int namSanXuat = Integer.parseInt(array[2]);
                String chuSoHuu = array[3];
                int soChoNgoi = Integer.parseInt(array[4]);
                String typeCar = array[5];
                Vehicle vehicle = new Car(bienKiemSoat,tenhangSanXuat,namSanXuat,chuSoHuu,soChoNgoi, typeCar);
                vehicleList.add(vehicle);
            } else {
                String bienKiemSoat = array[0];
                String tenhangSanXuat = array[1];
                int namSanXuat = Integer.parseInt(array[2]);
                String chuSoHuu = array[3];
                double congSuat = Double.parseDouble(array[4]);
                Vehicle vehicle = new Motorbike(bienKiemSoat,tenhangSanXuat,namSanXuat,chuSoHuu,congSuat);
                vehicleList.add(vehicle);
            }

        }
        return vehicleList;
    }

    @Override
    public List<HangSanXuat> getListHangSanXuat() {
       List<String> stringList = ReadAndWriteFileToCSV.readFileCSV(HANGSANXUAT_DATA);
       List<HangSanXuat> hangSanXuatList = new ArrayList<>();
       String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            String stt = array[0];
            String hangsanXuat = array[1];
            String national = array[2];
            HangSanXuat hangSanXuat = new HangSanXuat(stt,hangsanXuat, national);
            hangSanXuatList.add(hangSanXuat);
        }
        return hangSanXuatList;
    }

    @Override
    public void update(List<Vehicle> vehicleList) {
        List<String> stringList = new ArrayList<>();
        for (Vehicle vehicle: vehicleList) {
            stringList.add(vehicle.getInfoToCSV());
        }
        ReadAndWriteFileToCSV.writeToFile(VEHICLE_DATA, stringList, false);
    }
}
