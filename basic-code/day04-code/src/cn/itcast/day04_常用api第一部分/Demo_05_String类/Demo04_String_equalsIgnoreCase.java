package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class Demo04_String_equalsIgnoreCase {
    public static void main(String[] args) {
        //equalsIgnoreCase(String str),���Ӵ�Сд�������ݱȽ�
        String A = "JAVA";
        String B = "java";
        System.out.println(A.equals(B));  //false
        System.out.println(A.equalsIgnoreCase(B));  //true
    }
}
