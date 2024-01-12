package view;

public class Menu {
    public static void showMenu() {
        String[] listOption = {"1. Hiển thị danh sách hoọc sinh",
                                "2.Thêm học sinh",
                                "3. Xóa học sinh",
                                 "4.Sửa học sinh",
                                  "5.Tìm kiếm học sinh",
                                 "6.Kết thúc chương trình"};
        for(String op : listOption) {
            System.out.println(op);
        }
    }
}
