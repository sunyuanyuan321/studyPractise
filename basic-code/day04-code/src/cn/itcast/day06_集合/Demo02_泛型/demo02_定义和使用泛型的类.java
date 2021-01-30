package cn.itcast.day06_集合.Demo02_泛型;

public class demo02_定义和使用泛型的类 {
    public static void main(String[] args) {
        //创建对象,不使用泛型，继承的是 Object类，
        GeneracClass gc = new GeneracClass();
        gc.setName("张三");
        //gc.setName(12);   //int类型报错
        System.out.println(gc.getName());

        GeneracClass2<Integer> in = new GeneracClass2<>();
     //   in.setName("12");  //数据类型不合，编译报错
        in.setName(12);
        System.out.println(in.getName());
    }
}
