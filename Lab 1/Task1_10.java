import java.util.Scanner;

public class Task1_8 {
    
    public static String season(int month) {
        if (month == 12 || month == 1 || month == 2) {
            return "зима";
        } else if (month == 3 || month == 4 || month == 5) {
            return "весна";
        } else if (month == 6 || month == 7 || month == 8) {
            return "лето";
        } else return "осень";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int month = scanner.nextInt();
        
        String result = season(month);
        System.out.println(result);
        
        scanner.close();
    }
}
