package cn.itcast.day06_集合.Demo02_泛型;

public class demo03_定义含有泛型的方法 {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01("adc");
        gm.method01(123);

        //使用静态方法
        GenericMethod.method02("dfg");
    }
}
