package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

public class Person {

    private String name;
    private int age;
    //无参构造方法
    public Person() {
    }
    //全参构造方法    alt+insert
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
