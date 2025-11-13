import java.util.Scanner;

// Создайте программу, которая возвращает n-е число Фибоначчи (начиная с 0, 1, 1, 2, 3, 5, …).  Реализовать рекурсивно!

public class Text3_8 {
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
        scanner.close();
    }
}
