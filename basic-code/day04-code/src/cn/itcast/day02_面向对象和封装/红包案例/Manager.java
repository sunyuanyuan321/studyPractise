package cn.itcast.day02_面向对象和封装.红包案例;

import java.util.ArrayList;

public class Manager extends User {
    //构造方法，无参，有参
    public Manager() {
      //  super();       //默认可以不用写
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //群主发红包的方法
    public ArrayList<Integer> send(int totalMoney, int count) {
        //创建一个集合
        ArrayList<Integer> redList = new ArrayList<>();

        //群主的余额
        int leftMoney = super.getMoney();

        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);
        int mod = totalMoney % count;
        int avg = totalMoney / count;

        for (int i = 0; i < count; i++) {
            redList.add(avg);  //加到集合中
        }
        int last = avg + mod;
        redList.add(avg);
        return redList;
    }
}
