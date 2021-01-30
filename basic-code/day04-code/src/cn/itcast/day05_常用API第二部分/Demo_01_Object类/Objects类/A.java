package cn.itcast.day05_常用API第二部分.Object类.Objects类;

public class A {
    public static void main(String[] args) {
        String str1= "abc";
        System.out.println(str1);  //默认使用 str1.toString方法
        System.out.println(str1.toString());
/*
  public String toString() {
        return this;
    }
 */

        cn.itcast.day05_常用API第二部分.Object类.Objects类.Student stu = new cn.itcast.day05_常用API第二部分.Object类.Objects类.Student("周瑜",12);
        System.out.println(stu);
        //为什么 字符串可以直接打印，对象打印确实地址值，是由于字符串对toString进行了重写
        System.out.println(stu.toString());

        /*
        //没有重写
         public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }        cn.itcast.day05_常用API第二部分.Object类和Objects类.Student@1540e19d
         */
    }
}
