public class Product {
    private int id;
    private String name;
    private double pice;
    private int quantity;
    private String category;
    public Product(){

    }
    public Product(int id, String name, double pice, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.pice = pice;
        this.quantity = quantity;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPice() {
        return pice;
    }

    public void setPice(double pice) {
        this.pice = pice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}