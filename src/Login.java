import java.util.Scanner;

public class Login {

    public int login(){
        String username, password;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        username = inputScanner.next();

        System.out.print("Enter Password: ");
        password = inputScanner.next();

        return validateCredentials(username, password);
    }

    private int validateCredentials(String username, String password){
        if (FileReader.buyerCredentialsList.containsKey(username)) {
            if (FileReader.buyerCredentialsList.get(username).equals(password)) {
                printDecoratedWelcomeMessage("Buyer");
                return 0;
            }
        }
        if (FileReader.sellerCredentialsList.containsKey(username)) {
            if (FileReader.sellerCredentialsList.get(username).equals(password)) {
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
