package cn.itcast.day03_�̳����̬.day03_interface.�ӿ�_����;

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
