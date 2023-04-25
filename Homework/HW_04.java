import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*  Содержимое text.in:
    Иванов Иван Степанович 16 М
    Соловьев Никита Ильич 32 М
    Васильев Сергей Арсентьевич 27 М
    Сахаров Анатолий Данилович 35 М
    Хромов Александр Даниилович 38 М
    Зайцев Егор Фёдорович 41 М
    Петров Михаил Богданович 45 М
    Титова Ева Владимировна 33 Ж
    Киселева Виктория Глебовна 37 Ж
    Комаров Владимир Артемьевич 55 М
    Рыбаков Даниил Романович 66 М
    Дементьева Алина Артёмовна 22 Ж
    Макарова Диана Владимировна 43 Ж
    q

*/


public class HW_04 {
    public static void main(String[] args) {

//        программа попросит ввести данные о пользователях ФИО, возраст и пол,
//        сохранит инфо в структуру данных и выведет инфо отсортированную по возрасту, по полу;
//        также реализовать красивый вывод

        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> patronimyc = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Character> gender = new ArrayList<>();
        LinkedList<Integer> id = new LinkedList<>();

        Scanner scanner = new Scanner(System.in); // Иванов Иван Степанович 16 M
        String line = scanner.nextLine();
        int id_count = 0;

        while (!line.equals("q")) {
            String[] strings = line.split(" ");
            lastname.add(strings[0]);
            firstname.add(strings[1]);
            patronimyc.add(strings[2]);
            age.add(Integer.valueOf(strings[3]));
            gender.add(strings[4].charAt(0));
            id.add(id_count++);
            line = scanner.nextLine();
        }

        sort_data_by_integer_list(age, id, "descending");
        print_data(lastname, firstname, patronimyc, age, gender, id, "gender", "Ж");
        print_data(lastname, firstname, patronimyc, age, gender, id, "gender", "М");
        print_data(lastname, firstname, patronimyc, age, gender, id, "patronimyc", "Арсен");
        print_data(lastname, firstname, patronimyc, age, gender, id, "age", "35");
        print_data(lastname, firstname, patronimyc, age, gender, id, "", "");
    }

    public static void print_data(ArrayList<String> in_lastname,
                                  ArrayList<String> in_firstname,
                                  ArrayList<String> in_patronimyc,
                                  ArrayList<Integer> in_age,
                                  ArrayList<Character> in_gender,
                                  LinkedList<Integer> in_id,
                                  String in_query_list,
                                  String in_query
                                  ) {

        ArrayList<String> query_str_list = switch (in_query_list) {
            case "lastname" -> new ArrayList<>(in_lastname);
            case "firstname" -> new ArrayList<>(in_firstname);
            case "patronimyc" -> new ArrayList<>(in_patronimyc);
            default -> new ArrayList<>();
        };

        ArrayList<Integer> query_int_list = in_query_list.equals("age") ?
                new ArrayList<>(in_age) : new ArrayList<>();

        ArrayList<Character> query_chr_list = in_query_list.equals("gender") ?
                new ArrayList<>(in_gender) : new ArrayList<>();

        System.out.println("-".repeat(44));
        System.out.println("| id |   Фамилия   | И.| О.| Возраст | Пол |");
        for (int id : in_id
             ) {
            if (query_str_list.isEmpty() && query_int_list.isEmpty() && query_chr_list.isEmpty()) {
                System.out.format("| %-3d| %-12s| %-1s.| %-1s.| %-8d| %-4s|%n"
                        , id, in_lastname.get(id), in_firstname.get(id).charAt(0), in_patronimyc.get(id).charAt(0)
                        , in_age.get(id), in_gender.get(id));
            }
            else if (
                !query_str_list.isEmpty() && (query_str_list.get(id).contains(in_query)) ||
                !query_int_list.isEmpty() && (query_int_list.get(id) == Integer.parseInt(in_query)) ||
                !query_chr_list.isEmpty() && (query_chr_list.get(id).equals(in_query.charAt(0)))
            ) {
                System.out.format("| %-3d| %-12s| %-1s.| %-1s.| %-8d| %-4s|%n"
                        , id, in_lastname.get(id), in_firstname.get(id).charAt(0), in_patronimyc.get(id).charAt(0)
                        , in_age.get(id), in_gender.get(id));
            }
        }
    }


    public static void sort_data_by_integer_list(ArrayList<Integer> in_list, LinkedList<Integer> in_id, String flag) {
        ArrayList<Integer> temp_list = new ArrayList<>(in_list);
        for (int i = 0, size = temp_list.size(); i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (flag.equals("ascending") && temp_list.get(j) > temp_list.get(j + 1)) {
                    // sorting clone of in_list
                    int temp_val = temp_list.get(j);
                    temp_list.set(j, temp_list.get(j + 1));
                    temp_list.set((j + 1), temp_val);
                    // implement sort from clone to id list
                    temp_val = in_id.get(j);
                    in_id.set(j, in_id.get(j + 1));
                    in_id.set((j + 1), temp_val);
                } else if (flag.equals("descending") && temp_list.get(j) < temp_list.get(j + 1)) {
                    // sorting clone of in_list
                    int temp_val = temp_list.get(j);
                    temp_list.set(j, temp_list.get(j + 1));
                    temp_list.set((j + 1), temp_val);
                    // implement sort from clone to id list
                    temp_val = in_id.get(j);
                    in_id.set(j, in_id.get(j + 1));
                    in_id.set((j + 1), temp_val);
                }
            }
        }
    }
}

