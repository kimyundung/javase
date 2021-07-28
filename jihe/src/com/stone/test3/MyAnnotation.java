package com.stone.test3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 标签
 * 要贴在货物上
 *
 * 若一个注解中没有任何的成员，则这样的注解叫标记注解
 */
//@Retention(value = RetentionPolicy.SOURCE)    // 表示下面的注解在源代码中有效
//@Retention(RetentionPolicy.CLASS)             // 表示下面的注解在字节码文件中有效
@Retention(RetentionPolicy.RUNTIME)             // 表示下面的注解在运行时有效
public @interface MyAnnotation {
    //声明一个String类型的成员变量，名字为value
    public String value() default "123";   //默认值：123
    public String value2();
}
