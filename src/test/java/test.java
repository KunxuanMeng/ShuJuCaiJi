import java.text.SimpleDateFormat;
import java.util.Date;

public class test{
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        System.out.println(String.valueOf ((Long.parseLong(simpleDateFormat.format(new Date()))) - 1));

    }
}