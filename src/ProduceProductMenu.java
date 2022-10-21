public class ProduceProductMenu implements ProductMenu{

    @Override
    public void showMenu() {
        ProductIterator productIterator = new ProductIterator("Produce");
        // Iterator Pattern Used To Iterate Through ClassProductList to Get Produce Type Items
        System.out.println("-> (Iterator Pattern) Iterating Through ProductList With Type=Produce Filter");
        while (productIterator.hasNext()){
            System.out.println(productIterator.next());
        }
    }

    @Override
    public void showAddButton() {
    }

    @Override
    public void showViewButton() {
    }

    @Override
    public void showRadioButton() {
    }

    @Override
    public void showLabels() {
    }

    @Override
    public void showComboxes() {
    }

}
