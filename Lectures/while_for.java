public class while_for {
    public static void main(String[] args) {

        // While
//        int value = 321;
//        int count = 0;
//        while (value != 0) {
//            value /= 10;
//            count++;
//        }
//        System.out.println(count);


        //  Do -> While
//        public static void main(String[] args) {
//            int value = 321;
//            int count = 0;
//            do {
//                value /= 10;
//                count++;
//            } while (value != 0);
//            System.out.println(count);


        // For -> with Continue
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0)
//                continue;  // break -> will get out of cycle
//            System.out.println(i);


        // ForEach
        int[] arr = new int[]{1, 2, 3, 4, 5, 77};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
        }

        for (int item : arr) {
            System.out.println(item);
        }


    }
}
