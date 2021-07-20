package com.stone.test1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

    public static void main(String[] args){

        Collection c1 = new ArrayList();
        System.out.println(c1);
        System.out.println("-----------------------");

        boolean b1 = c1.add("one");
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("-----------------------");

        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("-----------------------");

        b1 = c1.add(new Person("张飞",30));
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);
        System.out.println("-----------------------");

        Collection c2 = new ArrayList();
        c2.add(3);
        c2.add("four");
        //b1 = c2.addAll(c1);\
        b1 = c2.add(c1);
        System.out.println("b1 = " + b1);
        System.out.println("c2 = " + c2);
        System.out.println("-----------------------");

    }
}
