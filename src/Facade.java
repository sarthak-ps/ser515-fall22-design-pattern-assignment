import java.util.Scanner;

public class Facade {

    // -1 value means user is not yet logged in
    private int userType = -1;

    private Product theSelectedProduct;

    private int nProductCategory;

    private ClassProductList theProductList;

    private Person thePerson;

    // Facade Pattern Used
    public void launch(){

        FileDataManager.readBuyerCredentials();
        FileDataManager.readSellerCredentials();
        FileDataManager.readProductInfo();

        int userSelection = -1;
        Scanner scanner = new Scanner(System.in);
        Person person = null;

        while (userSelection != 0 && userType == -1){
            System.out.println("\nChoose One Of The Following:");
            System.out.println("1: SignUp New User");
            System.out.println("2: LogIn Existing User");
            System.out.println("----------------------------");
            System.out.print("Choose Your Operation: ");

            userSelection = scanner.nextInt();
            System.out.println("");

            switch (userSelection){
                case 1:
                    Login login = new Login();
                    UserInfoItem userInfoItem = login.signup();
                    createUser(userInfoItem);
                    break;
                case 2:
                    login();
                    if (userType == 0) {
                        person = PersonFactory.createPerson("buyer");
                    }
                    else if (userType == 1){
                        person = PersonFactory.createPerson("seller");
                    }
                    break;
                default:
                    userSelection = 0;
                    break;
            }
        }

        System.out.println("\n1. Meat Product Menu");
        System.out.println("2. Produce Product Menu");
        System.out.println("-----------------------------");
        System.out.print("Choose a Product Menu (1/2): ");
        Scanner inputScanner = new Scanner(System.in);
        ProductMenu productMenu = null;

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

        person.setTheProductMenu(productMenu);

        selectProduct(person);
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

    public void selectProduct(Person person){
        person.showMenu();
    }

    public void productOperation(){}

    public void createUser(UserInfoItem userInfoItem){
        FileDataManager.addNewUser(userInfoItem);
    }

}
