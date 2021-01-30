package cn.itcast.day06_集合.Demo02_泛型.demo04_定义和使用泛型接口;

public class GenericInterfaceImpl1 implements GenericInterface<String> {
    //实现类
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
