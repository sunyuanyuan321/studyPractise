package cn.itcast.day04_����api��һ����.Demo_03_Random;

import java.util.Random;
import java.util.Scanner;

public class Demo04��������Ϸ {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);

        System.out.println("����ʾ��" + num);

        Scanner t = new Scanner(System.in);
        System.out.println("������һ������");
        int a = t.nextInt();
        int n = 1;
        int m = 1;

        while (num != a) {
            if (a > num) {
                System.out.println("��´��ˣ�������� " + a + " С����������һ������");
            } else {
                System.out.println("��´��ˣ�������� " + a + " ����������һ������");

            }
            n = n + 1;
            a = t.nextInt();
        }
        System.out.println("N���ڲ¶��ˣ�һ������ " + n + "  ��");
        System.out.println("========================");
        System.out.println("��M����һ������");
        int b = t.nextInt();
        while (num != b) {
            if (b> num) {
                System.out.println("��´��ˣ�������� " + b + " С����������һ������");
            } else {
                System.out.println("��´��ˣ�������� " + b + " ����������һ������");

            }
            m = m + 1;
            b = t.nextInt();
        }
        System.out.println("M���ڲ¶��ˣ�һ������ " + m + "  ��");

        if (n > m) {
            System.out.println(" N��µĴ����࣬��Ⱦƣ�");
        }
        if (n == m) {
            System.out.println("�µĴ���һ���࣬����һ��");
        }
        else{
            System.out.println( " M��µĴ����࣬��Ⱦƣ�");
        }
    }

}
