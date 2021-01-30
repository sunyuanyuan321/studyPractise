package cn.itcast.day03_继承与多态.Multi_多态.Demo01_多态的定义;

import cn.itcast.day03_继承与多态.Multi_多态.Demo01_多态的定义.Fu;

public class Zi extends Fu {

    int num =10;
    int age =18;
    @Override
    public void method() {
        System.out.println("父类重写，执行子类方法");
    }

    public void methodzi(){
        System.out.println("子类特有方法，执行");
    }

}
