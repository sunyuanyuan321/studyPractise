package cn.itcast.day05_����API�ڶ�����.Object��.Objects��;

public class A {
    public static void main(String[] args) {
        String str1= "abc";
        System.out.println(str1);  //Ĭ��ʹ�� str1.toString����
        System.out.println(str1.toString());
/*
  public String toString() {
        return this;
    }
 */

        cn.itcast.day05_����API�ڶ�����.Object��.Objects��.Student stu = new cn.itcast.day05_����API�ڶ�����.Object��.Objects��.Student("���",12);
        System.out.println(stu);
        //Ϊʲô �ַ�������ֱ�Ӵ�ӡ�������ӡȷʵ��ֵַ���������ַ�����toString��������д
        System.out.println(stu.toString());

        /*
        //û����д
         public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }        cn.itcast.day05_����API�ڶ�����.Object���Objects��.Student@1540e19d
         */
    }
}
