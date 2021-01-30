package cn.itcast.day02_面向对象和封装.红包案例;

public class User {
    //成员变量
    private String name;
    private int money;

    //构造方法，无参
    public User() {
    }

    //构造方法，有参
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //输出用户的余额
    public void show() {
        System.out.println("我叫" + name + ",我有多少钱" + money);
    }

    //get/set方法，获取余额，更新余额
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
