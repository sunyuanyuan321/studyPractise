package cn.itcast.day05_����API�ڶ�����.Demo_04_Sysrem��;

public class ��ϰ {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(s1);
        int a = 1;
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);;
        }
        System.out.println(a);
        long s2 = System.currentTimeMillis();
        System.out.println(s2);
        long runTime = s2 - s1;
        System.out.println(runTime);
    }
}
