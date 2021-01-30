package cn.itcast.day03_继承与多态.day03_interface.接口_私有方法;


public class MyInterfaceImpl implements MyInterface {

    //私有化后，本类使用，静态
    private static void methodCommon(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }
    @Override
    public void method1() {
        System.out.println("抽象方法重写");
        methodCommon();
    }

    @Override
    public void method2() {
        methodCommon();

    }


}
