package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class Demo05_StringGet {
    public static void main(String[] args) {
        //�ַ��� ����
        int a = "abcdefg".length();
        System.out.println(a);
        System.out.println("eqddsdwqd".length());

        //ƴ���ַ���
        String str1 = "Hello";
        String str2 = "World";
        String str3 =  str1.concat(str2);
        System.out.println(str3);

        //ָ������λ�� �����ַ�
        System.out.println(str1.charAt(2));

        //�����״γ���  ����λ�ã�û���򷵻� -1
        System.out.println(str3.indexOf("llo"));
        System.out.println(str1.indexOf("ld"));   // -1
    }
}
