package cn.itcast.day03_�̳����̬.Multi_��̬.Demo01_��̬�Ķ���;

public class Demo01Multi {
    public static void main(String[] args) {
        //��������
        Zi a = new Zi();
        a.method();  //������д��ִ�����෽��
        a.methodzi();  //�������з�����ִ��
        System.out.println(a.age);  //18
        System.out.println(a.num);  //10

        System.out.println("====================");

        Fu obj = new Zi();
        obj.method();  //������д��ִ�����෽��
        obj.methodFU();  //�������з���
        System.out.println(obj.num);  //20
    //  obj.methodzi();  //�����������е�

        //��������
        System.out.println("-----------------");
        Fu obj1 = new Fu();
        obj1.methodFU();
        obj1.method();
        System.out.println(obj1.num);
    }
}
