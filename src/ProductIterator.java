import java.util.Iterator;

public class ProductIterator implements ListIterator{

    ClassProductList productList;

    private Iterator iterator;

    ProductIterator(){
        productList = FileDataManager.productsList;
        this.iterator = productList.iterator();
    }

    // Type can be provided as Meat/Produce
    // which will return an iterator to a
    // filtered product list.
    ProductIterator(String type){
        productList = new ClassProductList();
        for (Product product: FileDataManager.productsList) {
            if (product.getType().equals(type)){
                productList.add(product);
            }
        }
        this.iterator = productList.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }

    @Override
    public void moveToHead() {
        iterator = productList.iterator();
    }

    @Override
    public void remove() {
        iterator.remove();
    }

}
