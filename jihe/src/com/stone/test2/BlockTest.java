package com.stone.test2;

/**
 * 静态代码块 & 构造块 & 构造方法
 */
public class BlockTest {

    /**
     * 1
     * 静态代码块
     * 静态代码块会随着<类的加载>而准备就绪，会先于构造块执行
     * 当需要在执行代码块之前随着类的加载做一些准备工作时，则编写代码到静态代码块中。如：加载数据库驱动包
     */
    static {
        System.out.println("静态代码块！");
    }

    /**
     * 2
     * 构造块
     * 当需要在执行构造方法之前做一些准备工作时，则将准备工作的相关代码写在构造块中即可。如：对成员变量进行的统一的初始化操作
     */
    {
        System.out.println("构造块！");
    }

    /**
     * 3
     * 构造方法
     */
    public BlockTest(){
        System.out.println("构造方法体！");
    }

    public static void main(String[] args){
        BlockTest bt = new BlockTest();
        BlockTest bt2 = new BlockTest();
    }
}
