package cn.itcast.day04_����api��һ����.Demo_05_String��.��ϰ;

public class a {
    public static void main(String[] args) {
        //�ַ������� ת���� �ַ���
        char[] chars = {'a', 'b', 'c'};
        String a = new String(chars);
        System.out.println(a);

        //��ֵ������ ת���� �ַ���
        int[] age = {23, 21, 22};
        String age2 = new String(age.toString());
        System.out.println(age[1]);


        //�ַ��� ת���� ����
        String name = "��ԲԲ";
        char[] char2 = name.toCharArray();
        System.out.println(char2[1]);
    }
}
