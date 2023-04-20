// Евгений Борисович

import java.util.Random;

public class Seminar_01 {

    public static void main(String[] args) {

//      Task01
        Random random = new Random();
        int num = random.nextInt();
        System.out.println(num);
        String reversed_num = Integer.toString(num);
        String result = "";
        for (int i = 0; i < reversed_num.length(); i++) {
            result += reversed_num.charAt(reversed_num.length() - 1 - i);
        }
        System.out.println(result);

//      Task02
        String name = "иванов федор петрович";
        String[] strings = name.split(" ");
        System.out.println(strings[0].substring(0,1).toUpperCase() + strings[0].substring(1) + " " +
                strings[1].substring(0,1).toUpperCase() + strings[1].substring(1) + " " +
                strings[2].substring(0,1).toUpperCase() + strings[2].substring(1));
    }


    private static void print(String s) {
        System.out.println(s);
    }


    public static void seminar_01_body() {
        int i = 128;
        long l;
        float f = .86f;
        double d = 566.86;
        byte b;
        short sh;
        char c = 'f'; // char - 16bit unsigned

        String s = ":";
        s += ") Smile";
        print(s.repeat(12));
        print(String.valueOf(s.length()));
        print(s.toLowerCase());
        print(String.valueOf(s.toUpperCase().charAt(s.length()-1)));
        print(":) ".repeat(12));

        if (s.contains(":")) print("true"); else print("false");
        if (s.equals(":")) print("true"); else print("false");

        print(s.replace(')', '('));

        s.substring(3, s.length()-2);
        String[] lines = s.split(" ");

        int[] ints = new int[]{1,2,3,4,5};
        i = ints.length;

        int[] tmp = new int[ints.length+1];
        for (int j=0;j<ints.length;j++) {
            tmp[j] = ints[j];
        }
        ints = tmp;

        if (2==3) {
            System.out.println("Hello World");
        }

        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.toBinaryString(17).length());
        Integer.parseInt("1265");
    }
}
