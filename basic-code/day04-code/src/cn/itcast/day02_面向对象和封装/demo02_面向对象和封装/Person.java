package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

public class Person {
    String name;

    public void sayHello(String who){
        System.out.println(who+"你好，我是"+name);

    }

    public  void sayBayBay(String name){
       // this.name=Person.name;
        System.out.println(name+"你好，我是"+this.name+"，我走了");
        System.out.println(this);
    }
}
