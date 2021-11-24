package QLSanPham.model;

public class Product {
    private int id;
    private String productName;
    private double cost;
    private int quantity;
    private String description;
    static int idNumber;

    public Product() {
    }

    public Product(String productName, double cost, int quantity, String description) {
        this.id = ++idNumber;
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                " productName='" + productName +
                " cost=" + cost +
                " quantity=" + quantity +
                " description='" + description +
                        "\n";
    }


}
