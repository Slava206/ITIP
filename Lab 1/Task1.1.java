import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int F = scan.nextInt();
        System.out.println(toFahrenheit(F));
    }

    public static int toFahrenheit(int F){
        return (F * 9/5) + 32;
    }
    
}
