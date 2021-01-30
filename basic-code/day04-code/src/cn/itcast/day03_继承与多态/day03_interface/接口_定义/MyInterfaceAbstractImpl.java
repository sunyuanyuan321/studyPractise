package cn.itcast.day03_继承与多态.day03_interface.接口_定义;

public class MyInterfaceAbstractImpl implements MyInterfaceAbs {
        //alt+回车，方法重写，必须覆盖重写，所有的抽象方法

    @Override
    public void methodAbs() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbs02() {
        System.out.println("这是第二个方法");
    }

    @Override
    public void methodAbs03() {
        System.out.println("这是第三个方法");
    }

    @Override
    public void methodAbs04() {
        System.out.println("这是第四个方法");
    }
}
