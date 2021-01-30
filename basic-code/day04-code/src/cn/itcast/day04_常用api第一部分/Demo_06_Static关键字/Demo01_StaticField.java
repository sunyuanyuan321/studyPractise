package cn.itcast.day04_常用api第一部分.Demo_06_Static关键字;

public class Demo01_StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);

        Student two = new Student("黄蓉", 16);
     
        //static静态，赋值给所有成员
        one.room = "502";  //都有教室502
        System.out.println(two.room);

        //Student.room="404";
        System.out.println(Student.room);
        System.out.println("姓名：" + one.getName() + "  年龄" + one.getAge() + "   教室" + one.room + "    学号：" + one.getId());
        System.out.println("姓名：" + two.getName() + "  年龄" + two.getAge() + "   教室" + two.room + "    学号：" + two.getId());

    }
}
