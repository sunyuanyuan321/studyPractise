package cn.itcast.day02_�������ͷ�װ.�������;

public class User {
    //��Ա����
    private String name;
    private int money;

    //���췽�����޲�
    public User() {
    }

    //���췽�����в�
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //����û������
    public void show() {
        System.out.println("�ҽ�" + name + ",���ж���Ǯ" + money);
    }

    //get/set��������ȡ���������
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
