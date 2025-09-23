import java.util.Scanner;

// Неделя - дни

public class Task1_4 {
    public static String daysToWeeks(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        
        String weeksText;
        if(weeks == 1){
            weeksText = "неделя";
        } else if(weeks >= 2 && weeks <= 4){
            weeksText = "недели";
        } else {
            weeksText = "недель";
        }

        String daysText;
        if(remainingDays == 1){
            daysText = "день";
        } else if(remainingDays >= 2 && remainingDays <= 4){
            daysText = "дня";
        } else {
            daysText = "дней";
        }
        return weeks + " " + weeksText + " и " + remainingDays + " " + daysText;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        String result = daysToWeeks(days);
        System.out.println(result);
        scan.close();
    }
}
