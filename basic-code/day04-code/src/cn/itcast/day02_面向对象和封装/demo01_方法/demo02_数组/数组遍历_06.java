package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;

public class 数组遍历_06 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35, 45, 20};

        //遍历,方法一
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");
        //遍历，方法二，作为方法传递参数
        printArray(array);  //传进去的们就是array当中保存的地址值

        //数组最大值
        System.out.println("------------");
        int a = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > a) {
                a = array[j];
            }
        }
        System.out.println(a);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


