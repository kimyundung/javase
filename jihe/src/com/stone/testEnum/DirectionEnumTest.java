package com.stone.testEnum;

public class DirectionEnumTest {
    public static void main(String[] args) {

        // values() 枚举中所有对象
        DirectionEnum[] enums = DirectionEnum.values();

        // ordinal() 下标
        for( DirectionEnum e: enums){
            System.out.println(e+ ", " + e.ordinal());
        }

        // 枚举类集成接口，调用重写方法
        for(DirectionEnum e :enums){
            e.show();
        }

    }
}
