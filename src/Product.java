class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        validatePrice(price);
        this.name = "zla_nazwa";
        this.price = price;
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
