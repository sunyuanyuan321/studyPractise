package cn.itcast.day03_�̳����̬.day03_interface.�ӿ�_Ĭ�Ϸ���;

public class Demo02Interface {
    public static void main(String[] args) {

        //default �ӿ� Ĭ�Ϸ�����������ǽӿ����������⣬��Ӱ���Ͻӿڵ�ʹ��
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        //��������ӵ�Ĭ�Ϸ���A
        a.methodDefault();
        System.out.println("-------------------");


        MyInterfaceDefaultB b =new MyInterfaceDefaultB();
        b.methodAbs();
        //������д���µ�������ӵ�Ĭ�Ϸ���B
        b.methodDefault();
    }
}
