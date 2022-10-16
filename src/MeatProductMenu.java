public class MeatProductMenu implements ProductMenu{

    @Override
    public void showMenu() {
    }

    @Override
    public void showAddButton() {
    }

    @Override
    public void showViewButton() {
    }

    @Override
    public void showRadioButton() {
    }

    @Override
    public void showLabels() {
    }

    @Override
    public void showComboxes() {
    }

    @Override
    public void selectProduct(int userType){
        Person person;
        if (userType == 0){
            person = PersonFactory.createPerson("buyer");
        } else {
            person = PersonFactory.createPerson("seller");
        }
        System.out.println("-> (Bridge Pattern) Connecting ProductMenu & Person");
        person.showMenu();
    }

}
