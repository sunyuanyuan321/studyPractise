package cn.itcast.day02_�������ͷ�װ.demo02_�������ͷ�װ;

public class students {
    // 1����Ա����
    private String name;
    private int age;
    //2���޲������췽��
    public students() {
        System.out.println();
    }
    //3���в���/ȫ�������췽��
    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //4��getting/setting����
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
        System.out.println(name+"��"+this.name+"��ͬѧ");
    }

}
