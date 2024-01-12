package model;

public abstract class Vehicle {
    private String bienKiemSoat;
    private String tenhangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Vehicle() {
    }

    public Vehicle(String bienKiemSoat, String tenhangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenhangSanXuat = tenhangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenhangSanXuat() {
        return tenhangSanXuat;
    }

    public void setTenhangSanXuat(String tenhangSanXuat) {
        this.tenhangSanXuat = tenhangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ",tenhangSanXuat='" + tenhangSanXuat + '\'' +
                ",namSanXuat=" + namSanXuat +
                ",chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return this.bienKiemSoat + "," + this.tenhangSanXuat + "," + this.namSanXuat+ "," + this.chuSoHuu;
    }
}
