package headfirst.ch07adapterandfacade.adapter.enumerationiterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration<?> enumumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
