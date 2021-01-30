package cn.itcast.day03_继承与多态.day03_interface.接口_默认方法;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("这是老接口，不变，实现了抽象方法B");
    }

//    @Override
//    public void method02() {
//    }


    @Override
    public void methodDefault() {
        System.out.println("新接口，实现类B，覆盖重写了接口的默认方法");
    }
}
