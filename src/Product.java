class Product {
    private String name;
    private double price;

    private double vat;

    public Product(String name, double price, double vat) {
        validatePrice(price);
        this.name = name;
        this.price = price;
        this.vat = vat;
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

    public double getVat(double price, double vat) {
        return price*vat;
    }
}
