package com.stone.test2;

public class StaticOuterTest {

    public static void main(String[] args) {

        StaticOuter.StaticInner si = new StaticOuter.StaticInner();

        si.show();
        System.out.println("----------------");
        si.show2(5);

    }
}
