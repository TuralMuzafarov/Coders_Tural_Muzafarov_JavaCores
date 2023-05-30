package Chapter1.Class.May13.Practice.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GetSubscribtion {
    public static LocalDate getSubscribtion(int money)
    {
        LocalDate ExpDate = LocalDate.of(2023,5,13);
        System.out.println(ExpDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
        if(money >= 60) {
            ExpDate = ExpDate.plusYears(money / 60);
            money = money % 60;
        }
        if(money >= 25 )
        {
            ExpDate = ExpDate.plusMonths(2*(money/25));
            money = money%25;
        }
        if(money >= 15)
        {
            ExpDate = ExpDate.plusMonths(money/15);
            money %= 15;
        }

        if(money >= 5)
        {
            ExpDate = ExpDate.plusWeeks(money/5);
            money = money%5;
        }
        return ExpDate;
    }
    public static void main(String[] args) {
        int money;
        money = new Scanner(System.in).nextInt();
        LocalDate ExpDate;
        ExpDate = GetSubscribtion.getSubscribtion(money);
        System.out.println(ExpDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));
    }
}
