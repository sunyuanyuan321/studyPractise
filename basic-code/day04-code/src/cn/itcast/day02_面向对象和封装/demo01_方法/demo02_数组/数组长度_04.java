package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;

/*
如何获取数组的长度？
格式：数组名称.length
得到一个int数字，代表数组的长度

数组创建后，程序运行期间，长度不可改变
 */
public class 数组长度_04 {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = {1, 2, 3, 4, 5, 6, 7, 8};

        int len = arrayB.length;
        System.out.println(len);

        //使用循环,遍历
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }


}
