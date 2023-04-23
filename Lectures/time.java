import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static void main(String[] args) throws InterruptedException {

        double begin = System.currentTimeMillis();
        double end = System.currentTimeMillis();
        System.out.println("Elapsed time: "+ (end - begin));


//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSD");
        Date date = new Date();
        System.out.println(dateFormat.format(date));


        long startTime = System.nanoTime();
        Thread.sleep(200);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  // divide by 1_000_000 to get milliseconds.

        System.out.println(duration);


    }
}