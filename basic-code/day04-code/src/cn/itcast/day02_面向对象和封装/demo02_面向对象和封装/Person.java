package cn.itcast.day02_�������ͷ�װ.demo02_�������ͷ�װ;

public class Person {
    String name;

    public void sayHello(String who){
        System.out.println(who+"��ã�����"+name);

    }

    public  void sayBayBay(String name){
       // this.name=Person.name;
        System.out.println(name+"��ã�����"+this.name+"��������");
        System.out.println(this);
    }
}
