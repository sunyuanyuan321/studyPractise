package cn.itcast.day03_继承与多态.day03_interface.接口_私有方法;

public interface MyInterface {
    public abstract void method1();

    public default void method2() {
        System.out.println("默认方法执行，打印");

    }

    public static void method3(){
        System.out.println("静态方法执行，打印");

    }
    //私有化  方法
    //private void methodCommon()

    }

