package cn.itcast.day03_�̳����̬.day03_interface.�ӿ�_˽�з���;

public interface MyInterface {
    public abstract void method1();

    public default void method2() {
        System.out.println("Ĭ�Ϸ���ִ�У���ӡ");

    }

    public static void method3(){
        System.out.println("��̬����ִ�У���ӡ");

    }
    //˽�л�  ����
    //private void methodCommon()

    }

