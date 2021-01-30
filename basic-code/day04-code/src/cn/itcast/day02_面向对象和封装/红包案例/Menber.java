package cn.itcast.day02_面向对象和封装.红包案例;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {
    //构造方法，无参/有参
    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }


    public void receive (ArrayList<Integer> List){
        //多个红包中随机抽取一个，随机获取一个集合的索引编号
        int index = new Random().nextInt(List.size());

        //根据索引，从集合中删除，同时将被删除的数赋值给自己，要用
        int delta  = List.remove(index);

        //get，set方法，获取之前的，加上红包的，得到最新的红包存放到集合中
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
