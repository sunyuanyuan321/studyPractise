package cn.itcast.day04_����api��һ����.Demo_05_String��.��ϰ;

public class aaa {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + "word" + array[i] + "]";
            } else {
                str = str + "word" + array[i] + "#";
            }
        }
        return str;
    }
}

