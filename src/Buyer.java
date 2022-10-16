public class Buyer extends Person{

    @Override
    public void showMenu() {
        System.out.println("\nShowing Buyer Menu Items...");
    }

    @Override
    public ProductMenu createProductMenu() {
        return null;
    }

}
