package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class Demo06_Substring {
    public static void main(String[] args) {
        //��ȡ����λ�õ��ַ�β��
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println(str1.substring(str1.indexOf("Wor")));

        //��ȡһ���ķ�Χ��ʵ����  [  )
        String str4 = str1.substring(4,7);
        System.out.println(str4);   //oWo

    }
}
