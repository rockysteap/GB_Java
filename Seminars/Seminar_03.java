import java.util.*;

public class Seminar_03 {
    public static void main(String[] args) {


//        List list = new ArrayList();
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(.1);
//        list.add(.1f);
//        list.add("One");
//        list.add(true);

//        if (list.get(0) instanceof Integer) {   // здесь элемент Object
//            int a = ((Integer)list.get(0));     // его надо приводить
//        }
//
//        ArrayList<String> list = new ArrayList<>();  // <> - diamond -> обобщение
//        list.add("One");

//        под капотом имеет динамический массив со ссылками на конкретные объекты
//        capacity - переменная списка -> изначальный объем
//        изначально создается пустой массив с 10 ячейками, затем добавляет половину плюс 1

//        ArrayList<Integer> list_i1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) list_i1.add(new Random().nextInt(25));
//
//        for (int i = 0; i < list_i1.size(); i++) {
//            System.out.println(list_i1.get(i));
//        }
//
//        for (int n: list_i1) {
//            System.out.println(n);
//        }

//          lambda:
//        list_i1.forEach(n -> System.out.print(n));
//        list_i1.forEach(System.out::println);

//        Iterator<Integer> iterator = list_i1.iterator();
//        while (iterator.hasNext()) {
//            int n = iterator.next();
//            System.out.println(n+" ");
//            iterator.remove();
//        }
//
//        System.out.println(list_i1);


//        ListIterator<Integer> iterator = list_i1.listIterator(list_i1.size()-1);
//        while (iterator.hasPrevious()) {
//            int n = iterator.previous();
//            System.out.print(n+", ");
//            iterator.remove();
//        }
//
//        System.out.println(list_i1);

            ArrayList<String> list = new ArrayList<>();
            list.add("One");
            list.add("Два");
            list.add(1, "Три");
            list.add("Квас");
            list.add("Ал");
            list.add("Пирог");
            list.add("Слон");
            list.add("Кора");
            list.remove(1);
            String a = list.get(0);
            System.out.println(list);

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
//            }
//        });

            ArrayList<Integer> listI1 = new ArrayList<>();
            ArrayList<Integer> listI2 = new ArrayList<>();
            for (int i=0; i < 10; i++) {
                listI1.add(new Random().nextInt(25));
                listI2.add(new Random().nextInt(25));
            }

//        for (int i=0; i<listI1.size(); i++){
//            System.out.println(listI1.get(i));
//        }

//        for (int n: listI1) {
//            System.out.println(n);
//        }

//        listI1.forEach(n -> System.out.println(n));

//        ListIterator<Integer> iterator = listI1.listIterator(listI1.size());
//        while (iterator.hasPrevious()){
//            int n = iterator.previous();
//            System.out.print(n+", ");
//            iterator.remove();
//        }

//        listI1.addAll(listI2);
            System.out.println(listI1);
            System.out.println(listI2);
            System.out.println("-".repeat(30));
            listI1.removeAll(listI2);
            listI1.retainAll(listI2);
            System.out.println(listI1);

            final int f = 6;

            if (listI2.contains(45)) System.out.println(true);
            List<Integer> listI3 = listI2.subList(0, 2);
            listI3= (List<Integer>) listI2.clone();
//        listI2.clear();
//        if (list.get(0) instanceof Integer) {
//            int a = ((Integer)list.get(0));
//        }
//        String[] strings = new String[10];

            System.out.println(listI2);
            listI2.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1%2 != 0) return 1;
                    if (o2%2 != 0) return 0;
                    return -1;
                }
            });
            System.out.println(listI2);

            LinkedList<Integer> integers = new LinkedList<>();
            integers.add(3);
            listI1.addAll(integers);

            System.out.println(Arrays.toString(new int[]{3, 4,5}));

//            Fio fio = new Fio("Иванов", "Иван", "Степанович");
//            System.out.println(fio);
    }
}


//class Fio{
//    private String f, i, o;
//
//    public Fio(String f, String i, String o) {
//        this.f = f;
//        this.i = i;
//        this.o = o;
//    }
//
//    @Override
//    public String toString() {
//        return f+" "+i.toUpperCase().charAt(0)+"."+o.toUpperCase().charAt(0)+".";
//    }
//}
