package cn.itcast.day06_集合.Demo02_泛型;

public class GenericMethod {
    //泛型作为返回值类型，定义一个方法
    public <M> void method01(M m) {
        System.out.println(m);
    }

    //定义一个静态方法
    public static <S> void method02(S s){
        System.out.println(s);
    }
}
