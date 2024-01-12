package view;

public class Menu {
    public static void showMenu() {
        String[] listOption = {"1. Thêm bệnh nhân",
                "2.Xóa bệnh nhân",
                "3.Hiển thị danh sách bệnh nhân",
                "4.Kết thúc chương trình"};
        for(String op : listOption) {
            System.out.println(op);
        }
    }

}
