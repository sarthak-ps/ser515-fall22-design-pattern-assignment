public abstract class Person {

    private ProductMenu theProductMenu;

    public abstract void showMenu();

    public void showAddButton(){}

    public void showViewButton(){}

    public void showRadioButton(){}

    public void showLabels(){}

    public abstract ProductMenu createProductMenu();

    public ProductMenu getTheProductMenu() {
        return theProductMenu;
    }

    public void setTheProductMenu(ProductMenu theProductMenu) {
        this.theProductMenu = theProductMenu;
    }
    
}
