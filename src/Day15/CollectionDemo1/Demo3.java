package Day15.CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("123");
        collection.add("456");
        Iterator iterable=collection.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
            System.out.println(iterable.hasNext());
        }
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
