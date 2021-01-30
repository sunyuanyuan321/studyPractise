package cn.itcast.day05_常用API第二部分.Object类.Object类_toString方法;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    //打印字符串的话，需要重写toString方法，默认就是对象的地址值； alt+insert，tostring
    @Override
    public String toString() {
        return "Person { name = " + name + "，age= " + age + "}";
    }

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
