package model;

public class BenhThuong extends BenhAn{
    private double phiNamVien;

    public BenhThuong() {
    }

    public BenhThuong(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhThuong(int STT, String maBenhAn, String tenBenhNhan, String ngaynhapvien, String ngayravien, String lydo, double phiNamVien) {
        super(STT, maBenhAn, tenBenhNhan, ngaynhapvien, ngayravien, lydo);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.phiNamVien;
    }
}
