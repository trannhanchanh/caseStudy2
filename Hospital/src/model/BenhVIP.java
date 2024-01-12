package model;

public class BenhVIP extends BenhAn {
    private String loaiVIP;
    private String thoihan;

    public BenhVIP() {
    }

    public BenhVIP(String loaiVIP, String thoihan) {
        this.loaiVIP = loaiVIP;
        this.thoihan = thoihan;
    }

    public BenhVIP(int STT, String maBenhAn, String tenBenhNhan, String ngaynhapvien, String ngayravien, String lydo, String loaiVIP, String thoihan) {
        super(STT, maBenhAn, tenBenhNhan, ngaynhapvien, ngayravien, lydo);
        this.loaiVIP = loaiVIP;
        this.thoihan = thoihan;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoihan() {
        return thoihan;
    }

    public void setThoihan(String thoihan) {
        this.thoihan = thoihan;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.loaiVIP + ";" + this.thoihan;
    }
}
