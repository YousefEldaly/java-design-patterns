package headfirst.ch07adapterandfacade.adapter.enumerationiterator;

import java.util.*;

public class TestDrive {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Vector<String> v = new Vector<String>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Vector<String> v2 = new Vector<String>(Arrays.asList(args));
        Enumeration<String> enumeration2 = v2.elements();
        while (enumeration2.hasMoreElements()) {
            System.out.println(enumeration2.nextElement());
        }
        Iterator<String> iterator2 = v2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
