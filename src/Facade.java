import java.util.Scanner;

public class Facade {

    private int userType;

    private Product theSelectedProduct;

    private int nProductCategory;

    private ClassProductList theProductList;

    private Person thePerson;

    // Facade Pattern Used
    public void launch(){
        login();

        System.out.println("1. Meat Product Menu");
        System.out.println("2. Produce Product Menu");
        System.out.print("Choose a Product Menu (1/2): ");
        Scanner inputScanner = new Scanner(System.in);
        ProductMenu productMenu;

        // Factory Pattern Used
        switch (inputScanner.nextInt()){
            case 1:
                productMenu = ProductMenuFactory.createProduceMenu("meat");
                break;
            case 2:
                productMenu = ProductMenuFactory.createProduceMenu("produce");
                break;
            default:
                System.out.println("Invalid Menu Option Selected. Terminating Application...");
                System.exit(-1);
        }
    }

    public boolean login(){
        Login login = new Login();
        userType = login.login();
        return userType != -1;
    }

    public void addTrading(){}

    public void viewTrading(){}

    public void decideBidding(){}

    public void discussBidding(){}

    public void submitBidding(){}

    public void remind(){}

    public void createProductList(){}

    public void attachProductToUser(){}

    public void selectProduct(){}

    public void productOperation(){}

}
