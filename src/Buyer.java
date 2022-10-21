public class Buyer extends Person{

    @Override
    public void showMenu() {
        // Bridge Pattern Used To Bridge Person and ProductMenu
        System.out.println("-> (Bridge Pattern) Connecting Buyer (Person) with ProductMenu...\n");
        System.out.println("Menu Items:");
        System.out.println("------------------------");
        getTheProductMenu().showMenu();
    }

    @Override
    public ProductMenu createProductMenu() {
        return null;
    }

}
