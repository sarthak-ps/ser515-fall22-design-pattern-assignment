public class ProductMenuFactory {

    // Factory Pattern Implementation
    public static ProductMenu createProduceMenu(String menuType){
        System.out.println("\n-> (Factory Pattern) Creating Product Menu...");
        if (menuType.equals("meat")){
            return new MeatProductMenu();
        }
        else if (menuType.equals("produce")){
            return new ProduceProductMenu();
        }
        else {
            System.out.println("Invalid Menu Type Provided to ProduceMenuFactory. Terminating Application...");
            System.exit(-1);
            return null;
        }
    }

}
