package cn.itcast.day03_继承与多态.Multi_多态.Demo02_对象的向上转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
