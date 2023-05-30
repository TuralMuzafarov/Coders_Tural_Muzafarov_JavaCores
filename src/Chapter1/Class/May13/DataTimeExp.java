package Chapter1.Class.May13;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DataTimeExp {
    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2023,5,10), LocalTime.of(1,45));
        if(LocalDateTime.now().isAfter(localDateTime))
        {
            System.out.println("True");
        }
        System.out.println(localDateTime);
        // Formatting Data
        String a = localDateTime.format(DateTimeFormatter.ofPattern("dd.MMMM.yy 'at' hh:mm:ss")); // Return String
        System.out.println(a);
    }
}
