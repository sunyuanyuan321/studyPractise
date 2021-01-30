package cn.itcast.day04_常用api第一部分.Demo_06_Static关键字;

public class Student {
    private String name;
    private int age;
    static String room;

    private int id;   //学号
    static int idCounter = 0;  //计数器

    public Student() {
        //this.id = ++idCounter;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
        System.out.println("全参方法调用次数是： "+id);
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
