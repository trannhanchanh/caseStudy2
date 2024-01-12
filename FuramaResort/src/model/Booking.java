package model;

public class Booking implements Comparable<Booking> {
    private String idBoooking;
    private String idCustomer;
    private String idService;
    private String dateStart;
    private String dateEnd;

    public Booking() {
    }

    public Booking(String idBoooking, String idCustomer, String idService, String dateStart, String dateEnd) {
        this.idBoooking = idBoooking;
        this.idCustomer = idCustomer;
        this.idService = idService;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public String getIdBoooking() {
        return idBoooking;
    }

    public void setIdBoooking(String idBoooking) {
        this.idBoooking = idBoooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBoooking='" + idBoooking + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        int dateCompare = o.dateStart.compareTo(this.dateStart);
        if (dateCompare == 0) {
            return o.dateEnd.compareTo(this.dateEnd);
        }
        return dateCompare;
    }
}
