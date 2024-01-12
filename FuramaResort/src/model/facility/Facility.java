package model.facility;

public abstract class Facility {
    private String idService;
    private String nameService;
    private float usingArea;
    private double price;
    private int maxPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String idService, String nameService, float usingArea, double price, int maxPeople, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usingArea = usingArea;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(float usingArea) {
        this.usingArea = usingArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return this.idService + "," + this.nameService + "," + this.usingArea + "," + this.price + "," + this.maxPeople + "," + this.rentalType  ;
    }
}
