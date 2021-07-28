package com.stone.testEnum;

/**
 * 编程实现所有方向的枚举，所有的方向：向上，向下，向左，向右
 *
 * 枚举类型要求所有枚举值必须放在枚举类型的最前面
 */
public enum DirectionEnum implements DirectionInterface{

    //枚举
    //UP ("向上"), DOWN ("向下"), LEFT ("向左"), RIGHT ("向右");
    //匿名内部类的语法格式：接口/父类类型 引用变量名 = new 接口/父类类型(){方法的重写};
    UP ("向上"){
        @Override
        public void show() {
            System.out.println("匿名内部类：up");
        }
    }, DOWN ("向下") {
        @Override
        public void show() {
            System.out.println("匿名内部类：down");
        }
    }, LEFT ("向左") {
        @Override
        public void show() {
            System.out.println("匿名内部类：left");
        }
    }, RIGHT ("向右") {
        @Override
        public void show() {
            System.out.println("匿名累不累：right");
        }
    };

    //成员变量
    private final String desc; //用于描述方向字符串的成员变量

    //构造方法
    DirectionEnum(String desc){
        this.desc = desc;
    }

    //成员方法
    public String getDesc() {
        return desc;
    }

    //整个枚举类型只重写一个，所有对象调用同一个
    /*@Override
    public void show() {
        System.out.println(this+" : 现在可以实现接口中抽象方法的重写了！");
    }*/
}
