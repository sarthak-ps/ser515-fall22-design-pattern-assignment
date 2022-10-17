import java.util.Iterator;

public class ProductIterator implements ListIterator{

    ClassProductList productList = new ClassProductList();

    private Iterator iterator;

    ProductIterator(){
        productList.add(new Product("Meat", "Beef"));
        productList.add(new Product("Meat", "Pork"));
        productList.add(new Product("Meat", "Mutton"));
        productList.add(new Product("Produce", "Tomato"));
        productList.add(new Product("Produce", "Onion"));

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
