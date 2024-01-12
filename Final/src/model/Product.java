package model;

public abstract class Product {
    private int id = 1;
    private String maProduct;
    private String nameProduct;
    private double price;
    private int quantity;
    private String nhaSanXuat;

    public Product() {
    }

    public Product(int id,String maProduct, String nameProduct, double price, int quantity, String nhaSanXuat) {
        this.id = id;
        this.maProduct = maProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaProduct() {
        return maProduct;
    }

    public void setMaProduct(String maProduct) {
        this.maProduct = maProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", maProduct='" + maProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return this.id + "," + this.maProduct + "," + this.nameProduct + "," + this.price + "," + this.quantity + "," + this.nhaSanXuat;
    }
}
