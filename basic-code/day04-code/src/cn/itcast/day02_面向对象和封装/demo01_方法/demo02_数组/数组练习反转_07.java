package cn.itcast.day02_�������ͷ�װ.demo01_����.demo02_����;

public class ������ϰ��ת_07 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        // int[] a = {5, 4, 3, 2, 1,};


        for (int i = 0, d = 0; i < a.length / 2; i++) {
            d = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = d;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
