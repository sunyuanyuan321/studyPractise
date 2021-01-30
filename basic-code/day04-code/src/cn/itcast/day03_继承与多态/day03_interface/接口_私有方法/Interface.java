package cn.itcast.day03_继承与多态.day03_interface.接口_私有方法;

public class Interface {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl() ;

        MyInterface.method3();

        impl.method2();
        impl.method1();
        }
    }

