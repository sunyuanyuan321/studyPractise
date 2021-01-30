package cn.itcast.day06_集合.Demo02_泛型;

public class GeneracClass2<E> {
    private E name;

    //泛型，数据类型不做规定
    public E getName() {
        return name;
    }

    public void setName(E name ) {
        this.name = name;
    }
}
