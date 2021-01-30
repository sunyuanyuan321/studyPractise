package cn.itcast.day03_继承与多态.Multi_多态.Demo01_多态的定义;

public class Demo01Multi {
    public static void main(String[] args) {
        //子类引用
        Zi a = new Zi();
        a.method();  //父类重写，执行子类方法
        a.methodzi();  //子类特有方法，执行
        System.out.println(a.age);  //18
        System.out.println(a.num);  //10

        System.out.println("====================");

        Fu obj = new Zi();
        obj.method();  //父类重写，执行子类方法
        obj.methodFU();  //父类特有方法
        System.out.println(obj.num);  //20
    //  obj.methodzi();  //报错，子类特有的

        //父类引用
        System.out.println("-----------------");
        Fu obj1 = new Fu();
        obj1.methodFU();
        obj1.method();
        System.out.println(obj1.num);
    }
}
