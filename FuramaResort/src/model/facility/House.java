package model.facility;

public class House extends Facility {
    private String roomStandard;
    private int quantityFloor;

    public House() {
    }

    public House(String roomStandard, int quantityFloor) {
        this.roomStandard = roomStandard;
        this.quantityFloor = quantityFloor;
    }

    public House(String idService, String nameService, float usingArea, double price, int maxPeople, String rentalType, String roomStandard, int quantityFloor) {
        super(idService, nameService, usingArea, price, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.quantityFloor = quantityFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getQuantityFloor() {
        return quantityFloor;
    }

    public void setQuantityFloor(int quantityFloor) {
        this.quantityFloor = quantityFloor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.roomStandard + "," + this.quantityFloor;
    }
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.roomStandard + "," + this.quantityFloor;
    }
}
