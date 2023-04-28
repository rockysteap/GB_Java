import java.util.*;

public class Seminar_05 {
    public static void main(String[] args) {

//        Random random = new Random(3); // с зерном отсчета

        HashMap<String, String> map = new HashMap<>();
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Один", "One");

        map.get("Пять");

        System.out.println(map.get("Пять"));

        map.remove("Пять");
        map.remove("Пять", "Five");  // returns true / false

        map.keySet();  // список ключей
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(map.get(key));
        }


        Set keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(map.get(keys.toArray()[i]));
        }

        map.entrySet();  // список ключ-значений

        map.replace("Пять", "5");
        map.replace("Пять", "Five", "5");  // return true / false

        map.getOrDefault("Шесть", "0");

//        map.containsKey();
//        map.containsValue();

        map.putIfAbsent("Шесть", "6");  // return null

        map.compute("Шесть", (k, v) -> v + "!");  // change value
        map.computeIfPresent("Шесть", (k, v) -> v + "!?");  // change value
        map.computeIfAbsent("Шесть", v -> v + "!?");  // change value

        for (String key: map.keySet()) {
            map.compute(key, (k, v) -> v+"!");
            map.merge(key, "!", String::concat);
        }


        map.forEach((k, v) -> System.out.println(k + " " + v));


        map.merge("Один", "7", String::concat);

        System.out.println(map);


        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("Пять", "Five");
        hashMap.put("Два", "Two");
        hashMap.put("Один", "One");
        hashMap.putIfAbsent("Шесть", "6");

        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        treeMap.putIfAbsent(6, "6");

        System.out.println(treeMap);

        System.out.println(treeMap.headMap(2));  // return value up to a key
        System.out.println(treeMap.headMap(2, true));  // return value up to a  key inclusive
        System.out.println(treeMap.tailMap(2, false));  // return value starting from key

    }
}
