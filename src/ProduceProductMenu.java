public class ProduceProductMenu implements ProductMenu{

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

    public void selectProduct(int userType){
        System.out.println("Selected Produce Product Menu! (Utilized Bridge Patter For Connection...)");
        Person person;
        if (userType == 0){
            person = PersonFactory.createPerson("buyer");
        } else {
            person = PersonFactory.createPerson("seller");
        }
        person.showMenu();
    }

}
