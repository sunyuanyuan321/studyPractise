package cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    /*equals������д����Ϊ��̬�ı׶ˣ�obj����ʹ�� �������еķ��������ݣ�������
    object obj = new person������  //��������ָ�� ������󣬶�̬
    ��Ҫ�õ�  ����ǿ��ת��
    person per3 = ��per3�� obj��
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

    //��ݼ� alt+insert  equals���� and hash
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

    //��ӡ�ַ����Ļ�����Ҫ��дtoString������Ĭ�Ͼ��Ƕ���ĵ�ֵַ�� alt+insert��tostring
//        @Override
//        public String toString () {
//            return "Person { name = " + name + "��age= " + age + "}";
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
