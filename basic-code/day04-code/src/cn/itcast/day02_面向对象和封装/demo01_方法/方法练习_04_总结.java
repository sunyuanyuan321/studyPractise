package cn.itcast.day02_面向对象和封装.demo01_方法;
/*
使用方法的注意事项：
1、方法应该定义在类中，但是不能在方法中再定义方法，总之，不能嵌套；
2、方法定义的前后顺序无所谓，都没有关系；
3、方法定义之后不会执行，如果希望执行，一定要调用，调用有三种情况，单独/打印/赋值等调用
4、如果方法有返回值，必须写上“return 返回值；”，不能没有
5、return后面的返回值的数据，必须和方法的返回值类型，对应起来；  getsum方法为int类型，return 10；不能为小数
6、对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己；
7、对于一个void方法当中最后一行的return可以省略不写；
8、一个方法当中可以有多个return语句，但是必须保证同时只有一个被执行；
 */
public class 方法练习_04_总结 {
    public static void main(String[] args) {

    }

    public static void method1(){
      //  return 10; //会报错，该方法返回值
        return;  //也可以不写
    }

    public static int getMax(int a ,int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
