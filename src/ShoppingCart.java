import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;
    private List<Service> services;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Koszyk jest pusty.");
        } else {
            System.out.println("Zawartość koszyka:");
            for (Product product : products) {
                System.out.println(product.getName() + " - " + product.getPrice() + " zł");
            }
        }
    }

    public void checkout() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.println("Do zapłaty: " + total + " zł");
        products.clear();
        System.out.println("Zamówienie złożone. Koszyk wyczyszczony.");
    }
}