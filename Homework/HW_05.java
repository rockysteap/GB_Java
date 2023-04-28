import java.util.HashMap;

public class HW_05 {
    public static void main(String[] args) {

//      Создать множество; ключ и значение - строки.
        HashMap<String, String> hashMap = new HashMap<>();

//      Добавить шесть элементов.
        hashMap.put("Семейство", "Дельфиновые");
        hashMap.put("Отряд", "Китопарнокопытные");
        hashMap.put("Класс", "Млекопитающие");
        hashMap.put("Тип", "Хордовые");
        hashMap.put("Царство", "Животные");
        hashMap.put("Домен", "Эукариоты");

//      Вывести в консоль значения.
        System.out.println("\n" + hashMap.values() + "\n");

//      Добавить ко всем значениям символ "!".
        hashMap.forEach((k, v) -> hashMap.merge(k, "!", String::concat));

//      Создать второе множество с таким же обобщением.
        HashMap<String, String> hashMap2 = new HashMap<>();

//      Ключи второго множества частично совпадают с ключами первого.
        hashMap2.put("Вид", "Саванный слон");
        hashMap2.put("Род", "Африканские слоны");
        hashMap2.put("Семейство", "Слоновые");
        hashMap2.put("Отряд", "Хоботные");
        hashMap2.put("Класс", "Млекопитающие");
        hashMap2.put("Тип", "Хордовые");

//      Объединить значения во втором множестве и первом, если ключи совпадают.
        hashMap2.forEach((k2, v2) ->
            hashMap.forEach((k, v) -> {
            if (k2.hashCode() == k.hashCode() && k2.equals(k)) {
                hashMap2.put(k2, v + v2);
                }
            }));

//      Вывести результат в консоль.
        hashMap2.forEach((k, v) -> System.out.format("%-10s %-1s%n", k, v));
    }
}
