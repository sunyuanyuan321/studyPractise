package cn.itcast.day02_�������ͷ�װ.demo02_�������ͷ�װ;
/*
ͨ������£�һ���಻��ֱ��ʹ�ã���Ҫ�����ഴ��һ�����󣬲���ʹ�á�
1��������ָ����Ҫʹ�õ��࣬��ʲôλ��
import ����.����
import java.util.Arrays;
import cn.itcast.day04.Student
2����������ʽ��
������  ������  = new �����ƣ�����
 */
public class ���󴴽�_03 {
    public static void main(String[] args) {
        //1��������ʹ��Student�࣬�ͱ�demo02 ��ͬһ�������棬����ʡ�Բ�д
        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.name = "����";
        stu.age = 55;
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
