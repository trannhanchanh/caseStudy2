package model;

public class Truck extends Vehicle {
    private double trongtai;

    public Truck() {
    }

    public Truck(double trongtai) {
        this.trongtai = trongtai;
    }

    public Truck(String bienKiemSoat, String tenhangSanXuat, int namSanXuat, String chuSoHuu, double trongtai) {
        super(bienKiemSoat, tenhangSanXuat, namSanXuat, chuSoHuu);
        this.trongtai = trongtai;
    }

    public double getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(double trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return super.toString() + " , " + this.trongtai;
    }

    @Override
    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.trongtai;
    }
}
