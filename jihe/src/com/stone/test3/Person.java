package com.stone.test3;

/**
 * 表示将标签MyAnnotation贴在Person类的代码中
 *
 * 使用注解时采用 成员参数名 = 成员参数值 , ....
 */
//@MyAnnotation(value = "hello", value2 = "world")
@MyAnnotation(value2 = "world")
public class Person {
    private String name;
    private Integer age;
}
