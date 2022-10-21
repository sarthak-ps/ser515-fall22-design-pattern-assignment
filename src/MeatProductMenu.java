public class MeatProductMenu implements ProductMenu{

    @Override
    public void showMenu() {
        ProductIterator productIterator = new ProductIterator("Meat");
        // Iterator Pattern Used To Iterate Through ClassProductList to Get Meat Type Items
        System.out.println("-> (Iterator Pattern) Iterating Through ProductList With Type=Meat Filter");
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
