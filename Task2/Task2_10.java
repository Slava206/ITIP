import java.util.Scanner;
public class Task2_10 {
    public static String grade(int score){
        if (score < 0 || score > 100){
            return "Invalid";
        }

        switch (score / 10) {
            case 10:
            case 9: return "A";
            case 8: return "B";
            case 7: return "C";
            case 6: return "D";
            default: return "F";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(grade(score));
        scanner.close();
    }
}
