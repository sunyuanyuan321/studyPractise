package cn.itcast.day06_����.Demo02_����.demo04_�����ʹ�÷��ͽӿ�;

public class demo04GenericInterface {
    public static void main(String[] args) {
        //�ӿڷ��ͣ���һ�ַ�ʽ
        //����GenericInterfaceImpl1�� ����
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("�ַ���");  //�ַ���

        //�ӿڷ��ͣ��ڶ��ַ�ʽ
        //����GenericInterfaceImpl2 ����
        GenericInterfaceImpl2 gi2 = new GenericInterfaceImpl2();
        gi2.method(1234); // 1234
    }
}
