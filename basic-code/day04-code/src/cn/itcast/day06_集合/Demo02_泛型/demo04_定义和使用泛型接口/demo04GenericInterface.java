package cn.itcast.day06_集合.Demo02_泛型.demo04_定义和使用泛型接口;

public class demo04GenericInterface {
    public static void main(String[] args) {
        //接口泛型，第一种方式
        //创建GenericInterfaceImpl1的 对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");  //字符串

        //接口泛型，第二种方式
        //创建GenericInterfaceImpl2 对象
        GenericInterfaceImpl2 gi2 = new GenericInterfaceImpl2();
        gi2.method(1234); // 1234
    }
}
