package com.stone.testAnnotation;

@ManType(value = "职工")
@ManType(value = "超人")
//@ManTypes({@ManType(value = "职工"), @ManType(value = "超人")}) //java8之前处理多个注解的方式
public class Man {

    @Deprecated // 表示该方法已经过时, 不建议使用
    public void show(){
        System.out.println("这个方法马上要过时了!");
    }

    public static void main(String[] args) {
        int ia = 97;
        char c1 = (@ManType char) ia;
    }
}
