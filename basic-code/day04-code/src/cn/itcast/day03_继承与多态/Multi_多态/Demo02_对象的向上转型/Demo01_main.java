package cn.itcast.day03_�̳����̬.Multi_��̬.Demo02_���������ת��;

public class Demo01_main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();
        System.out.println("===========");

        //�ҳ����ԣ�ִ��
        Animal animal = new Cat();  //����ת�ͳ� �������û��è�������з���
        animal.eat();
        System.out.println("----------------");

        Cat cat1 = (Cat) animal;  //������ ���� animal�л�ԭ��ϵ
        cat1.eat();
        cat1.catchMouse();

        Dog dog = (Dog) animal;  //��ԭ·�����󣬱���
        Dog dog1 =new Dog();
        dog.eat();
        dog.watchHouse();


    }
}
