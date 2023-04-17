import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s", name);
        iScanner.close();

        Scanner iScanner2 = new Scanner(System.in);
        System.out.print("int a: ");
        boolean flag = iScanner2.hasNextInt();
        System.out.println(flag);
        int i = iScanner2.nextInt();
        System.out.println(i);
        iScanner2.close();

        Scanner iScanner3 = new Scanner(System.in);
        System.out.print("int a: ");
        int x = iScanner3.nextInt();
        System.out.print("double a: ");
        double y = iScanner3.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner3.close();



    }
}
