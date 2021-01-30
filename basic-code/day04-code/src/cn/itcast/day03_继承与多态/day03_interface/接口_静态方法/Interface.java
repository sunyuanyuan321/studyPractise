package cn.itcast.day03_继承与多态.day03_interface.接口_静态方法;

public class Interface {
    public static void main(String[] args) {
        MyInterfaceImpl Impl = new MyInterfaceImpl();

        //static 跟对象/实现类没有关系
        //Impl.method()
        MyInterface.method();
    }
}
