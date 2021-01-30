package cn.itcast.day06_集合.Demo02_泛型.demo04_定义和使用泛型接口;

import cn.itcast.day03_继承与多态.day03_interface.接口_定义.Interface;

public interface GenericInterface<I> {
    //定义一个接口为泛型,创建抽象方法
    public abstract void method(I i);
}
