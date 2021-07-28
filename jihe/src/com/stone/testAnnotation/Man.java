package com.stone.testAnnotation;

@ManType(value = "职工")
@ManType(value = "超人")
//@ManTypes({@ManType(value = "职工"), @ManType(value = "超人")}) //java8之前处理多个注解的方式
public class Man {
    public static void main(String[] args) {
        int ia = 97;
        char c1 = (@ManType char) ia;
    }
}
