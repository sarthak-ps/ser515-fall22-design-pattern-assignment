public class Seller extends Person{

    @Override
    public void showMenu() {
        System.out.println("\nShowing Seller Menu Items...");
    }

    @Override
    public ProductMenu createProductMenu() {
        return null;
    }

}
