package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;

public class 数组遍历方法_08 {
    public static void main(String[] args) {
        calculate(1, 2, 3);
        System.out.println(calculate(1, 2, 3));
        
        int [] result = calculate(1,2,3);
        System.out.println("总和:"+result[0]);
        System.out.println("平均数:"+result[1]);
        System.out.println("-----------");
        printArray(result);
    }
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}