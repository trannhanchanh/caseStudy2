package repository;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import utils.ReadAndWriteFileToCSV;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository<Facility>{
    private ReadAndWriteFileToCSV readAndWriteFileToCSV = new ReadAndWriteFileToCSV();
    private final String FACILITY_DATA = "D:\\Code\\Java\\Codegym\\FuramaResort\\src\\data\\facility.csv";
    @Override
    public List<Facility> getList() {
       List<String> stringList = readAndWriteFileToCSV.readFileCSV(FACILITY_DATA);
       List<Facility> facilityList = new ArrayList<>();
       String[] array = null;
        for (String s: stringList) {
            array = s.split(",");
            if(array[0].contains("SVVL")) {
                String idService = array[0];
                String nameService = array[1];
                float usingArea = Float.parseFloat(array[2]);
                double price = Double.parseDouble(array[3]);
                int maxPeople = Integer.parseInt(array[4]);
                String rentalType = array[5];
                String roomStandard = array[6];
                float poolArea = Float.parseFloat(array[7]);
                int quantityFloor = Integer.parseInt(array[8]);
                Facility facility = new Villa(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, poolArea, quantityFloor);
                facilityList.add(facility);
            } else if(array[0].contains("SVHO")) {
                String idService = array[0];
                String nameService = array[1];
                float usingArea = Float.parseFloat(array[2]);
                double price = Double.parseDouble(array[3]);
                int maxPeople = Integer.parseInt(array[4]);
                String rentalType = array[5];
                String roomStandard = array[6];
                int quantityFloor = Integer.parseInt(array[7]);
                Facility facility = new House(idService, nameService, usingArea, price, maxPeople, rentalType, roomStandard, quantityFloor);
                facilityList.add(facility);
            } else {
                    String idService = array[0];
                    String nameService = array[1];
                    float usingArea = Float.parseFloat(array[2]);
                    double price = Double.parseDouble(array[3]);
                    int maxPeople = Integer.parseInt(array[4]);
                    String rentalType = array[5];
                    String freeService = array[6];
                    Facility facility = new Room(idService, nameService, usingArea, price, maxPeople, rentalType,freeService);
                    facilityList.add(facility);
            }

        }
        return facilityList;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        stringList.add(facility.getInfoToCSV());
        ReadAndWriteFileToCSV.writeToFile(FACILITY_DATA, stringList, true);
    }

    @Override
    public void edit(List<String> stringList) {

    }

    @Override
    public void delete(List<String> stringList) {

    }


}
