public class string {
    public static void main(String[] args) {

        //    int a = 1, b = 2;
        //    int c = a + b;
        //    String res = a + " + " + b + " = " + c;
        //    System.out.println(res);

//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);

    //  Виды спецификаторов

    // %d: целочисленных значений
    // %x: для вывода шестнадцатеричных чисел
    // %f: для вывода чисел с плавающей точкой
    // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
    // %c: для вывода одиночного символа
    // %s: для вывода строковых значений

//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi); // 3,141500
//        System.out.printf("%.2f\n", pi); // 3,14
//        System.out.printf("%.3f\n", pi); // 3,141
//        System.out.printf("%e\n", pi); // 3,141500e+00
//        System.out.printf("%.2e\n", pi); // 3,14e+00
//        System.out.printf("%.3e\n", pi); // 3,141e+00
/*
        // StringBuilder
        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        //System.out.println(sb);

//        builder.delete(0, builder.length()/2);
//        builder.insert(2, .43f);
//        builder.deleteCharAt(3);
//        builder.reverse();
//        builder.indexOf("Hel");
//        builder.lastIndexOf("l");
//        builder.replace(1, 5, "235");
//        builder.charAt(0);
//        System.out.println(builder.toString());
*/
/*
        String methods:
        concat(): объединение строк
        valueOf(): преобразует Object в строковое представление (завязан на toString())
        join(): объединяет набор строк в одну с учетом разделителя
        charAt(): получение символа по индексу
        indexOf(): первый индекс вхождения подстроки
        lastIndexOf(): последний индекс вхождения подстроки
        startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        replace(): замена одной подстроки на другую
        trim(): удаляет начальные и конечные пробелы
        substring(): возвращает подстроку, см.аргументы
        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        сompareTo(): сравнивает две строки
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках
 */

        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
    }
}
