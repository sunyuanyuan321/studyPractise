package cn.itcast.day03_�̳����̬.day03_interface.�ӿ�_Ĭ�Ϸ���;

public interface MyInterfaceDefault {
    //���󷽷�
    public abstract void methodAbs();

    //�����һ�����󷽷�,ʵ�ֵĹ��췽����Ҫ��������
    //public abstract void    method02();

    //�����һ�����󷽷���ΪĬ�Ϸ���
    public default void methodDefault() {
        System.out.println("��������ӵ�Ĭ�Ϸ���������");

    }
}
