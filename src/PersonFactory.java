public class PersonFactory {

    // Factory Pattern Implementation
    public static Person createPerson(String userType){
        System.out.println("-> (Factory Pattern) Creating User...");
        if (userType.equals("buyer")){
            return new Buyer();
        }
        else if (userType.equals("seller")){
            return new Seller();
        }
        else {
            System.out.println("Invalid User Type Provided to PersonFactory. Terminating Application...");
            System.exit(-1);
            return null;
        }
    }

}
