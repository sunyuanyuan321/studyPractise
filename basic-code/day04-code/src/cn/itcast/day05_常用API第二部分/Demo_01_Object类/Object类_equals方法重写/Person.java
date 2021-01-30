package cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    /*equals方法重写，因为多态的弊端，obj不能使用 子类特有的方法和内容（变量）
    object obj = new person（）；  //父类引用指向 子类对象，多态
    需要用到  向下强制转型
    person per3 = （per3） obj；
*/
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Person) {
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        return false;
//    }

    //快捷键 alt+insert  equals（） and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //打印字符串的话，需要重写toString方法，默认就是对象的地址值； alt+insert，tostring
//        @Override
//        public String toString () {
//            return "Person { name = " + name + "，age= " + age + "}";
//        }

    public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }
    }
