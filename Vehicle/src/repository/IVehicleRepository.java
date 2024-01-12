package repository;

import model.HangSanXuat;
import model.Vehicle;

import java.util.List;

public interface IVehicleRepository {
    void addVehicle(Vehicle vehicle);
    List<Vehicle> getList();
    List<HangSanXuat> getListHangSanXuat();
    void update(List<Vehicle> vehicleList);
}
