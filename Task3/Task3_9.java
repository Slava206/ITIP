import java.util.Scanner;

// Создайте программу, которая возвращает разницу между наибольшим и наименьшим элементом массива.

public class Task3_9 {
    public static int differenceMaxMin(int[] numbers){
        int min = numbers [0];
        int max = numbers [0];

        for (int num : numbers){
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String cleaned = input.replace("[", "").replace("]", "").replace(" ", "");
        String[] parts = cleaned.split(",");

        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(differenceMaxMin(numbers));
        scanner.close();
    }
}
