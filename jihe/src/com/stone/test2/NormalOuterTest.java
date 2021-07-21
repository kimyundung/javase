package com.stone.test2;

public class NormalOuterTest {

    public static void main(String[] args) {

        NormalOuter no = new NormalOuter();
        NormalOuter.NormalInner ni = no.new NormalInner();
        ni.show();
        System.out.println("--------------------");
        ni.show2(4);

    }
}
