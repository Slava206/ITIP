import java.util.Scanner;

// Создайте программу, которая принимает целое число и возвращает сумму его цифр.

public class Task3_4 {
    public static int sumOfDigits(int number){
        int num = number;
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumOfDigits(number));
        scanner.close();
    }
}
