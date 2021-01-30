package cn.itcast.day05_常用API第二部分.Object类.练习;

public class test_toString重写_or_equals方法重写 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        System.out.println(s1.toString() == s2);
        System.out.println("===========");

        cn.itcast.day05_常用API第二部分.Object类.练习.Student stu = new cn.itcast.day05_常用API第二部分.Object类.练习.Student("张三", 12);
        cn.itcast.day05_常用API第二部分.Object类.练习.Student stu1 = new cn.itcast.day05_常用API第二部分.Object类.练习.Student("张三", 12);

        String a = stu.toString();
        String b = stu1.toString();
        System.out.println(a+"        "+b);
        System.out.println("equals方法比较："+stu.toString().equals(stu1.toString()));

    }
}
