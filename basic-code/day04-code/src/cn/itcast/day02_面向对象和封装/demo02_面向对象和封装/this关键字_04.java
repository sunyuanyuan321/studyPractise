package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

public class this关键字_04 {
    public static void main(String[] args) {
        Person aaa = new Person();
        aaa.name = "你爸";
        aaa.sayHello("儿子");

        Person bbb = new Person();
        bbb.name = "阿姨";
        bbb.sayBayBay("小刚");
        // this关键字，其实和 bbb 是一个地址值，指向的都是成员变量地址
        System.out.println(bbb);

    }


}
