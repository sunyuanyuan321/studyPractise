package cn.itcast.day06_����.Demo02_����.demo04_�����ʹ�÷��ͽӿ�;

public class GenericInterfaceImpl2 <I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
