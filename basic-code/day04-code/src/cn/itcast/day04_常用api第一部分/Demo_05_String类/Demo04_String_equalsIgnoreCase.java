package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class Demo04_String_equalsIgnoreCase {
    public static void main(String[] args) {
        //equalsIgnoreCase(String str),忽视大小写进行内容比较
        String A = "JAVA";
        String B = "java";
        System.out.println(A.equals(B));  //false
        System.out.println(A.equalsIgnoreCase(B));  //true
    }
}
