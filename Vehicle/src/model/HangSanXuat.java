package model;

public class HangSanXuat {
    private String STT;
    private String hangSanXuat;
    private String national;

    public HangSanXuat() {
    }

    public HangSanXuat(String STT, String hangSanXuat, String national) {
        this.STT = STT;
        this.hangSanXuat = hangSanXuat;
        this.national = national;
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    @Override
    public String toString() {
        return "HangSanXuat{" +
                "STT='" + STT + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", national='" + national + '\'' +
                '}';
    }
}
