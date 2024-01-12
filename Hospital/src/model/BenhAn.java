package model;

public abstract class BenhAn {
    private int STT;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngaynhapvien;
    private String ngayravien;
    private String lydo;

    public BenhAn() {
    }

    public BenhAn(int STT, String maBenhAn, String tenBenhNhan, String ngaynhapvien, String ngayravien, String lydo) {
        this.STT = STT;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngaynhapvien = ngaynhapvien;
        this.ngayravien = ngayravien;
        this.lydo = lydo;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(String ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public String getNgayravien() {
        return ngayravien;
    }

    public void setNgayravien(String ngayravien) {
        this.ngayravien = ngayravien;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "STT=" + STT +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngaynhapvien='" + ngaynhapvien + '\'' +
                ", ngayravien='" + ngayravien + '\'' +
                ", lydo='" + lydo + '\'' +
                '}';
    }
}
