package cn.itcast.day02_�������ͷ�װ.demo01_����;

public class ������ϰ_02_��� {
    public static void main(String[] args) {
        System.out.println(getsum());
        System.out.println("==========");
        getsum2();
        System.out.println("=========");
        System.out.println(getsum3(100));

    }


    public static int getsum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void getsum2() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static int getsum3(int b) {
        int sum = 0;
        for (int i = 0; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
