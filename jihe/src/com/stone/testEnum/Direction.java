package com.stone.testEnum;

/**
 * 编程实现所有方向的枚举，所有的方向：向上，向下，向左，向右
 */
public class Direction {
    private final String desc; //用于描述方向字符串的成员变量

    public static final Direction UP = new Direction("向上");
    public static final Direction DOWN = new Direction("向下");
    public static final Direction LEFT = new Direction("向左");
    public static final Direction RIGHT = new Direction("向右");

    private Direction(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
