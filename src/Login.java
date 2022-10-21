import java.util.Scanner;

public class Login {

    private final Scanner inputScanner = new Scanner(System.in);

    public UserInfoItem signup(){
        int userType = scanUserType();
        String username = scanUsername();
        String password = scanPassword();
        return new UserInfoItem(userType, username.strip(), password.strip());
    }

    public int login(){
        String username = scanUsername();
        String password = scanPassword();
        return validateCredentials(username, password);
    }

    private String scanUsername(){
        String username;
        System.out.print("Enter Username: ");
        username = inputScanner.next();
        return username;
    }

    private String scanPassword(){
        String password;
        System.out.print("Enter Password: ");
        password = inputScanner.next();
        return password;
    }

    private int scanUserType(){
        int userType;
        System.out.println("Type of User You Want To Add:");
        System.out.println("0: Buyer");
        System.out.println("1: Seller");
        System.out.println("-----------------------------");
        System.out.print("Enter Type Of User: ");
        userType = inputScanner.nextInt();
        return userType;
    }

    private int validateCredentials(String username, String password){
        if (FileDataManager.buyerCredentialsList.containsKey(username)) {
            if (FileDataManager.buyerCredentialsList.get(username).equals(password)) {
                FileDataManager.currentSessionUsername = username;
                printDecoratedWelcomeMessage("Buyer");
                return 0;
            }
        }
        if (FileDataManager.sellerCredentialsList.containsKey(username)) {
            if (FileDataManager.sellerCredentialsList.get(username).equals(password)) {
                FileDataManager.currentSessionUsername = username;
                printDecoratedWelcomeMessage("Seller");
                return 1;
            }
        }
        System.out.println("Invalid credentials. Terminating application...");
        System.exit(-1);
        return -1;
    }

    private void printDecoratedWelcomeMessage(String userType){
        System.out.println("\n----------------");
        System.out.println("Welcome " + userType + "!");
        System.out.println("----------------\n");
    }

}
