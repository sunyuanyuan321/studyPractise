package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����;

public class Demo01Array {
    public static void main(String[] args) {
        //����һ������Ϊ��������
        // int[] Array = new int[3];

        //����һ�� ��������Ϊ����Ķ��󣬳���Ϊ3
        Person[] array = new Person[3];
        System.out.println(array[0]);
        System.out.println(array[1]);

        Person one = new Person("�����Ȱ�", 18);
        Person two = new Person("��������", 28);
        Person three = new Person("�������", 38);

        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[1]); //��ӡ�������ǵ�ֵַ

        //д�����࣬�������
        Person person = array[0];
        System.out.println(person.getName());

        System.out.println(array[1].getName()+"  "+array[1].getAge());

    }
}
