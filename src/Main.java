public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Mleko", 2.5);
        Product product2 = new Product("Chleb", 3.0);
        Product product3 = new Product("Jajka", 4.0);
        Product product4 = new Product("Czekolada", 4.5);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);

        cart.displayCart();
        cart.checkout();
    }
}