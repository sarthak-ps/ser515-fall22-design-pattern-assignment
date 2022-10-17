public class Product {

    private String type;
    private String name;

    Product(String type, String name){
        this.type = type;
        this.name = name;
    }

    public Product() { }

    @Override
    public String toString() {
        return type + " : " + name;
    }

}
