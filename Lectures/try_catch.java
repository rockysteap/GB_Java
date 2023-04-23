public class try_catch {
    public static void main(String[] args) {

        try {

            System.out.println("Код, в котором может появиться ошибка");

        } catch (Exception e) {  // put Exception, e -> like lambda every

            System.out.println("Обработка, если ошибка случилась");

        } finally {

            System.out.println("Код, который выполнится в любом случае");

        }

    }
}
