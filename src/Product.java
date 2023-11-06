class Product {
    private String name;
    private double price;
    private double tax;

    public Product(String name, double price) {
        validatePrice(price);
        this.name = name;
        this.price = price;
        this.tax = 23;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private void validatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cena nie może być ujemna");
        }
    }
}
