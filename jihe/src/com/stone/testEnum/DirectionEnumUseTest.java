package com.stone.testEnum;

public class DirectionEnumUseTest {

    static void testEnum(DirectionEnum de){
        switch (de){
            case UP:
                System.out.println("抬头");
                break;
            case DOWN:
                System.out.println("低头");
                break;
            case LEFT:
                System.out.println("left");
                break;
            case RIGHT:
                System.out.println("right");
                break;
            default:
                System.out.println("无此方向");
        }
    }

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        DirectionEnumUseTest.testEnum(DirectionEnum.DOWN);
        //DirectionUseTest.testEnum("向前"); Error
    }
}
