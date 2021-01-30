package cn.itcast.day06_集合.Demo02_泛型.demo04_定义和使用泛型接口;

public class GenericInterfaceImpl2 <I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
