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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
