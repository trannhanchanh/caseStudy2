package service;

import model.Hotel;
import util.CheckInputData;

public class HotelService implements IHotelService{
    private static final String PHONENUMBER_VALID = "^0\\d{9}$";
    @Override
    public void updateHotel(String hotel_idedit) {

    }

    @Override
    public void addHotel() {
        while (true) {
            // String hotel_id, String hotel_name, int hotel_room_available, String hotel_address, String hotel_phone, String hotel_rating
            String hotel_id = CheckInputData.checkInputNull("Mời bạn nhập hotel id:", "Id hotel");
            String hotel_name = CheckInputData.checkInputNull("Mời bạn nhập tên khách sạn:", "Tên khách sạn");
            int hotel_room_available = CheckInputData.checkInputInt("Mời bạn nhập số phòng khách sạn:", 0, "Số phòng khách sạn");
            String hotel_address = CheckInputData.checkInputNull("Mời bạn nhập địa chỉ khách sạn:", "Địa chỉ khách sạn");
            String hotel_phone = CheckInputData.checkInput("Mời bạn nhập số điện thoại khách sạn:", PHONENUMBER_VALID, "Số điện thoại không tồn tại.Vui lòng nhập lại.");
            String hotel_rating = CheckInputData.checkInputNull("Mời bạn nhập tiêu chuẩn khách sạn:", "Tiêu chuẩn khách sạn");
            Hotel hotel = new Hotel(hotel_id, hotel_name, nameProduct, price, quantity, nhaSanXuat, priceNK, province, thueNK);
            productRepository.addProduct(productNhapKhau);
            System.out.println("Đã thêm thành công.");

            String mess = "Bạn có muốn thêm nữa không?(Y/N)";
            if (Validation.confirm(mess)) {
                continue;
            } else {
                return;
            }
        }

    }

    @Override
    public void removeHotel(String hotel_iddel) {

    }

    @Override
    public void displayHotel() {

    }
}
