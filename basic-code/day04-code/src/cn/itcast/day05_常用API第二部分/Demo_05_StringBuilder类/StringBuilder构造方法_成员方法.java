package cn.itcast.day05_常用API第二部分.Demo_05_StringBuilder类;

public class StringBuilder构造方法_成员方法 {
    public static void main(String[] args) {
        //默认无参构造方法
        StringBuilder sb1 = new StringBuilder();
        //有参构造方法
        StringBuilder sb2 = new StringBuilder("abc");

        //append方法,添加
        sb2.append("cd");
        StringBuilder s2 = sb2.append("ef");
        System.out.println(s2.append(123)); //abccdef123
        System.out.println(s2.append("中文"));

        //toString方法，将当前StringBuilder对象转换为String对象
        System.out.println(s2.equals("abccdef123中文"));  //false
        s2.toString();
        System.out.println(s2.toString().equals("abccdef123中文"));  //true

        //链式编程
        System.out.println(sb1.append("asd").append("123").append(456).append("啊啊啊"));

    }
}
