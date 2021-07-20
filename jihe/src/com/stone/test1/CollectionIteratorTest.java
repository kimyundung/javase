package com.stone.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorTest {

    public static void main(String[] args) {

        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add(2);
        c1.add(new Person("zhangfei",30));

        Iterator iterator = c1.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }
    }
}
