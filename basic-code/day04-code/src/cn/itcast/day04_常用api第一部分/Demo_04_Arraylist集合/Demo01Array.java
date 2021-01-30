package cn.itcast.day04_常用api第一部分.Demo_04_Arraylist集合;

public class Demo01Array {
    public static void main(String[] args) {
        //创建一个长度为三的数组
        // int[] Array = new int[3];

        //创建一个 对象类型为数组的对象，长度为3
        Person[] array = new Person[3];
        System.out.println(array[0]);
        System.out.println(array[1]);

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("马儿扎哈", 38);

        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[1]); //打印出来的是地址值

        //写法多余，便于理解
        Person person = array[0];
        System.out.println(person.getName());

        System.out.println(array[1].getName()+"  "+array[1].getAge());

    }
}
