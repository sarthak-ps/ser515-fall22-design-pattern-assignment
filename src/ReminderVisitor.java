public class ReminderVisitor extends NodeVisitor{

    @Override
    void visitProduct(Product product) {

    }

    @Override
    void visitTrading(Trading trading) {
    }

    @Override
    void visitFacade(Facade facade) {
        // Visitor Pattern Used Here To Visit All Products in ProductList
        System.out.println("\n-> (Visitor Pattern) Visiting All Products List from visitFacade Method...");
        System.out.println("--------------------------------------------------------------------------");
        for (Product product: FileDataManager.productsList) {
            System.out.println(product);
        }
    }

}
