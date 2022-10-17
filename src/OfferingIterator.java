import java.util.Iterator;

public class OfferingIterator implements ListIterator{

    private OfferingList offeringList;

    private Iterator iterator;

    OfferingIterator(){
        offeringList.add(new Offering());
        offeringList.add(new Offering());
        offeringList.add(new Offering());
        offeringList.add(new Offering());
        offeringList.add(new Offering());

        this.iterator = offeringList.iterator();
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
        iterator = offeringList.iterator();
    }

    @Override
    public void remove() {
        iterator.remove();
    }

}
