package cn.itcast.day05_����API�ڶ�����.Object��.��ϰ;

public class test_toString��д_or_equals������д {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        System.out.println(s1.toString() == s2);
        System.out.println("===========");

        cn.itcast.day05_����API�ڶ�����.Object��.��ϰ.Student stu = new cn.itcast.day05_����API�ڶ�����.Object��.��ϰ.Student("����", 12);
        cn.itcast.day05_����API�ڶ�����.Object��.��ϰ.Student stu1 = new cn.itcast.day05_����API�ڶ�����.Object��.��ϰ.Student("����", 12);

        String a = stu.toString();
        String b = stu1.toString();
        System.out.println(a+"        "+b);
        System.out.println("equals�����Ƚϣ�"+stu.toString().equals(stu1.toString()));

    }
}
