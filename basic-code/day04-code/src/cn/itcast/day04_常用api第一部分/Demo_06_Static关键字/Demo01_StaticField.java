package cn.itcast.day04_����api��һ����.Demo_06_Static�ؼ���;

public class Demo01_StaticField {
    public static void main(String[] args) {
        Student one = new Student("����", 19);

        Student two = new Student("����", 16);
     
        //static��̬����ֵ�����г�Ա
        one.room = "502";  //���н���502
        System.out.println(two.room);

        //Student.room="404";
        System.out.println(Student.room);
        System.out.println("������" + one.getName() + "  ����" + one.getAge() + "   ����" + one.room + "    ѧ�ţ�" + one.getId());
        System.out.println("������" + two.getName() + "  ����" + two.getAge() + "   ����" + two.room + "    ѧ�ţ�" + two.getId());

    }
}
