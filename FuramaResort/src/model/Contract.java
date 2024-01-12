package model;

public class Contract {
    private String idContract;
    private String idBooking;
    private double depositMoney;
    private double totalMoney;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double depositMoney, double totalMoney) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", depositMoney=" + depositMoney +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
