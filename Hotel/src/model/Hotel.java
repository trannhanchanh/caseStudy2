package model;

public class Hotel {
    private String hotel_id;
    private String hotel_name;
    private int hotel_room_available;
    private String hotel_address;
    private String hotel_phone;
    private String hotel_rating;

    public Hotel() {
    }

    public Hotel(String hotel_id, String hotel_name, int hotel_room_available, String hotel_address, String hotel_phone, String hotel_rating) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_room_available = hotel_room_available;
        this.hotel_address = hotel_address;
        this.hotel_phone = hotel_phone;
        this.hotel_rating = hotel_rating;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public int getHotel_room_available() {
        return hotel_room_available;
    }

    public void setHotel_room_available(int hotel_room_available) {
        this.hotel_room_available = hotel_room_available;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public String getHotel_phone() {
        return hotel_phone;
    }

    public void setHotel_phone(String hotel_phone) {
        this.hotel_phone = hotel_phone;
    }

    public String getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(String hotel_rating) {
        this.hotel_rating = hotel_rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotel_id='" + hotel_id + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_room_available=" + hotel_room_available +
                ", hotel_address='" + hotel_address + '\'' +
                ", hotel_phone='" + hotel_phone + '\'' +
                ", hotel_rating='" + hotel_rating + '\'' +
                '}';
    }
    public String getInfoToCSV() {
        return this.hotel_id + "," + this.hotel_name + "," + this.hotel_room_available + "," + this.hotel_address + "," + this.hotel_phone + "," + this.hotel_rating;
    }
}
