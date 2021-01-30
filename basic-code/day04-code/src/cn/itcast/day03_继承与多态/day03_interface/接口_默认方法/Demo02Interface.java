package cn.itcast.day03_继承与多态.day03_interface.接口_默认方法;

public class Demo02Interface {
    public static void main(String[] args) {

        //default 接口 默认方法，解决的是接口升级的问题，不影响老接口的使用
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        //调用新添加的默认方法A
        a.methodDefault();
        System.out.println("-------------------");


        MyInterfaceDefaultB b =new MyInterfaceDefaultB();
        b.methodAbs();
        //覆盖重写，新调用新添加的默认方法B
        b.methodDefault();
    }
}
