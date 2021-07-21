package com.stone.test2;

/**
 * 普通内部类
 */
public class NormalOuter {

    /**
     * 成员变量
     */
    private int cnt = 1;

    /**
     * 普通内部类
     * 隶属于外部类的成员
     * 是对象层级
     */
    public class NormalInner{
        private int ia = 2;
        private int cnt = 3;
        public NormalInner(){
            System.out.println("普通内部类的构造方法体执行到了！");
        }
        public void show(){
            System.out.println("cnt = " + cnt);
            System.out.println("ia = " + ia);
            System.out.println("cnt + ia = " + (cnt+ia));
        }
        public void show2(int cnt){
            System.out.println("形参变量cnt：" + cnt);
            System.out.println("内部类中cnt：" + this.cnt);
            System.out.println("外部类中cnt：" + NormalOuter.this.cnt);
        }
    }

}
