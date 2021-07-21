package com.stone.test2;

/**
 * 静态内部类
 */
public class StaticOuter {

    /**
     * 成员变量
     */
    private int cnt = 1;        //隶属于对象层级
    private static int snt = 2; //隶属于类层级

    /**
     * 成员方法
     */
    public void show(){
        System.out.println("外部类中的show方法");
    }

    /**
     * 静态内部类
     * 有 static 修饰属于类层级
     */
    public static class StaticInner{
        private int ia = 3;
        private static int snt = 4;

        public StaticInner(){
            System.out.println("静态内部类的构造方法！");
        }

        public void show(){
            System.out.println("内部类 ia = " + ia);
            System.out.println("外部类 snt = " + snt);
            //System.out.println("外部类 cnt = " + cnt); //error 静态上下文不能访问非静态，因为此时可能还没有创建对象
        }

        public void show2(int snt){
            System.out.println("形参变量 snt = " + snt);
            System.out.println("内部类中 scn = " + StaticInner.snt);
            System.out.println("外部类中 scn = " + StaticOuter.snt);
            new StaticOuter().show();
        }
    }
}
