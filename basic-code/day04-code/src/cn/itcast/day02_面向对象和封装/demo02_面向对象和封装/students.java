package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

public class students {
    // 1、成员变量
    private String name;
    private int age;
    //2、无参数构造方法
    public students() {
        System.out.println();
    }
    //3、有参数/全参数构造方法
    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //4、getting/setting方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int age(){
        return age;
    }

    public void sayHello(String name){
        System.out.println(name+"是"+this.name+"的同学");
    }

}
