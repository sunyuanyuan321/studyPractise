package cn.itcast.day02_�������ͷ�װ.demo02_�������ͷ�װ;

public class һ����׼����_08 {
    public static void main(String[] args) {
        //�����޲�������
        students stu1 = new students();
        //  System.out.println(stu1.getName());  //Ĭ���� null

        //�����в����������������󣬲��Ҹ�ֵ
        students stu2 = new students("����ӱ", 28);
        System.out.println(stu2.getName());

        //����sayHello����
        stu2.sayHello("С��");
        stu1.sayHello("С��"); //û�и�ֵ С����null��ͬѧ
    }


}
