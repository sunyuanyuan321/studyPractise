package cn.itcast.day03_继承与多态.day03_interface.接口_定义;

public class Interface {
    public static void main(String[] args) {
        // MyInterfaceAbs impl =new MyInterfaceAbs() ;   //error
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();

        impl.methodAbs();
        impl.methodAbs02();
        impl.methodAbs03();
        impl.methodAbs04();

    }
}
