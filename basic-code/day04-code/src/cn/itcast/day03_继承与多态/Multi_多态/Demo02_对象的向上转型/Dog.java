package cn.itcast.day03_继承与多态.Multi_多态.Demo02_对象的向上转型;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public  void watchHouse(){
        System.out.println("狗狗看家");
    }
}
