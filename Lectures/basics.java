public class basics {
    public static void main(String[] args) {

        // Terminal output
//        System.out.println("Let me out!!");

        // Data types
        // Primitives types -> boolean, int, short, long, float, double, Char
        // Reference types -> String

        String s = null;  // vars need to be declared and initialized
//
        short age = 10; //10
        int salary = 123456; //123456
        float e = 2.7f; // 2.7
        double pi = 3.1415; // 3.1415

        char ch = '1';  // char type is numeric type
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456

        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

//        Операции Java
//          ● Присваивание: =
//          ● Арифметические: *, /, +, -, %, ++, --
//          ● Операции сравнения: <, >, ==, !=, >=, <=
//          ● Логические операции: ||, &&, ^, !
//          ● Побитовые операции <<, >>, &, |, ^

        String str1 = "qwerty";
        System.out.println("str1.charAt(1) = " + str1.charAt(1));
        System.out.println("str1 = " + str1);

        int a1 = 123;
        // =  a1->123 - (a1->122-postfix decrement -> a1->121-prefix decrement) = 2
        a1 = a1-- - --a1;
        int a2 = 123;
        a2 = --a2 - a2--;
        System.out.println("a1 = " + a1);
        System.out.println("a1 = " + a2);

        int a3 = 8;
        // 1000
        // a3 = a3 << 1;
        System.out.println("a3 << 1 =   {a3 << 1}");



    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
