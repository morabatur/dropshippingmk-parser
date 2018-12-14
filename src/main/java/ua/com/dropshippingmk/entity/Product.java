package ua.com.dropshippingmk.entity;

public class Product {
    private String name;
    private int price;
    private boolean status;
    private String code;
    private String desciption;
    private String category;


    public Product() {
    }

    public Product(String name, int price, boolean status, String code, String desciption, String category) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.code = code;
        this.desciption = desciption;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
