package model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private float poolArea;
    private int quantityFloor;

    public Villa() {
    }

    public Villa(String roomStandard, float poolArea, int quantityFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.quantityFloor = quantityFloor;
    }

    public Villa(String idService, String nameService, float usingArea, double price, int maxPeople, String rentalType, String roomStandard, float poolArea, int quantityFloor) {
        super(idService, nameService, usingArea, price, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.quantityFloor = quantityFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getQuantityFloor() {
        return quantityFloor;
    }

    public void setQuantityFloor(int quantityFloor) {
        this.quantityFloor = quantityFloor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.roomStandard + "," + this.poolArea + "," + this.quantityFloor;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.roomStandard + "," + this.poolArea + "," + this.quantityFloor;
    }
}
