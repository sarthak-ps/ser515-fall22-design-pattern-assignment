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
        System.out.println("----------------");
        if (username.equals("tutu") && password.equals("1111")){
            printDecoratedWelcomeMessage("Buyer");
            return 0;
        }
        if (username.equals("mimi") && password.equals("2222")){
            printDecoratedWelcomeMessage("Buyer");
            return 0;
        }
        if (username.equals("pepe") && password.equals("3333")){
            printDecoratedWelcomeMessage("Seller");
            return 1;
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
