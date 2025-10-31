import java.util.Scanner;

public class Task2_1 {
    public static int countDivisors(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countDivisors(number));
        scanner.close();
    }
}