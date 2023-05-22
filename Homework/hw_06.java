import java.util.*;

public class hw_06 {
    public static void main(String[] args) {

        hw06_myTreeSetClass hw06_myTreeSet = new hw06_myTreeSetClass();

        // метод add добавляющий элемент
        for (int i = 0; i < 10; i++) {
            hw06_myTreeSet.add(new Random().nextInt(-10, 10));
        }

        // метод toString возвращающий строку с элементами множества
        String my_string = hw06_myTreeSet.toString();
        System.out.println(my_string);

        // метод позволяющий читать элементы по индексу
        System.out.println(hw06_myTreeSet.getItem(new Random().nextInt(hw06_myTreeSet.size())));

    }
}


class hw06_myTreeSetClass {

    static final Object OBJECT = new Object();
    private final TreeMap<Integer, Object> treeMap = new TreeMap<>();

    public boolean add(int num) {
        return treeMap.put(num, OBJECT) == null;
    }

    public Integer getItem(int index) {
        return (Integer) treeMap.keySet().toArray()[index];
    }

    public String toString() {
        return treeMap.keySet().toString();
    }

    public Integer size() {
        return treeMap.size();
    }
}
