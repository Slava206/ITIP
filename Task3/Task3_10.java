import java.util.Scanner;

/* Создайте программу, которая принимает три числа (длины сторон) и возвращает true, если из них можно составить треугольник, иначе false.
(По правилу треугольника: сумма любых двух сторон больше третьей.) */

public class Task3_10 {
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(",");
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        int c = Integer.parseInt(parts[2].trim());

        System.out.println(isTriangle(a, b, c));
        scanner.close();
    }
}
