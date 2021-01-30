package cn.itcast.day02_面向对象和封装.demo01_方法;

//定义一个方法，用来判断两个数字是否相同

public class 方法练习_01_判断两数是否相同 {
    public static void main(String[] args) {
        same(4, 5);
        System.out.println(isSame(4, 5));
    }

    public static void same(int a, int b) {
        if (a == b) {
            System.out.println("这两个数相同");
        } else {
            System.out.println("这两个数不相同");
        }
    }

    public static boolean isSame(int a, int b) {

        //方法一
//        boolean same;
//        if (a==b){
//            same=true;
//        }
//        else{
//            same=false;
//        }
//        return same;
        //方法二
//        boolean same;
//        same = a == b ? true : false;
//        return same;
        //方法三
//        boolean same;
//        same = a == b;
//        return same;
        //方法四
        return a == b;
    }

}
