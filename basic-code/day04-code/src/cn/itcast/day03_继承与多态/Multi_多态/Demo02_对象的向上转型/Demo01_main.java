package cn.itcast.day03_继承与多态.Multi_多态.Demo02_对象的向上转型;

public class Demo01_main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.catchMouse();
        System.out.println("===========");

        //找出共性，执行
        Animal animal = new Cat();  //向上转型成 动物，动物没有猫狗的特有方法
        animal.eat();
        System.out.println("----------------");

        Cat cat1 = (Cat) animal;  //跟上面 对象 animal有还原关系
        cat1.eat();
        cat1.catchMouse();

        Dog dog = (Dog) animal;  //还原路径错误，报错
        Dog dog1 =new Dog();
        dog.eat();
        dog.watchHouse();


    }
}
