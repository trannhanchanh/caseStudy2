package model;

public class Motorbike extends Vehicle{
    private double congSuat;

    public Motorbike() {
    }

    public Motorbike(double congSuat) {
        this.congSuat = congSuat;
    }

    public Motorbike(String bienKiemSoat, String tenhangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenhangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.congSuat;
    }
}
