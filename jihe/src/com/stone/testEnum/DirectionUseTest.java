package com.stone.testEnum;

import java.util.Arrays;

public class DirectionUseTest {

    //静态方法
    static void testStr(String str){
        switch (str){
            case "向上":
                System.out.println("抬头");
                break;
            case "向下":
                System.out.println("低头");
                break;
            case "向左":
                System.out.println("left");
                break;
            case "向右":
                System.out.println("right");
                break;
            default:
                System.out.println("无此方向");
        }
    }


    public static void main(String[] args) {
        DirectionUseTest.testStr(Direction.UP.getDesc());
        DirectionUseTest.testStr("向前");


    }
}
