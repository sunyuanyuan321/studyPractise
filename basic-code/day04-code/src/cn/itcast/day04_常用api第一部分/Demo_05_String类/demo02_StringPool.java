package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class demo02_StringPool {
    public static void main(String[] args) {
        //�ַ���������

        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1==str2);  //ctrl+d  ������
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
