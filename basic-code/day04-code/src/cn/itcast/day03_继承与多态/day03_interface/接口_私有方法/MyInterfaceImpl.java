package cn.itcast.day03_�̳����̬.day03_interface.�ӿ�_˽�з���;


public class MyInterfaceImpl implements MyInterface {

    //˽�л��󣬱���ʹ�ã���̬
    private static void methodCommon(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }
    @Override
    public void method1() {
        System.out.println("���󷽷���д");
        methodCommon();
    }

    @Override
    public void method2() {
        methodCommon();

    }


}
