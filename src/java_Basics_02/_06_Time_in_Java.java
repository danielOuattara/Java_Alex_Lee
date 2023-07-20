package java_Basics_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _06_Time_in_Java {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println(currentDate.getTime());

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));

        SimpleDateFormat timeAMPMFormat = new SimpleDateFormat("h:mm:ss a");
        System.out.println(timeAMPMFormat.format(currentDate));
    }


}
