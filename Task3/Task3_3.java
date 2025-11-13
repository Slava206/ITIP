import java.util.Scanner;
import java.util.Arrays;

// Создайте программу, которая возвращает второе по величине число в массиве.

public class Task3_3 {
    public static int secondLargest(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String cleaned = input.replace("[", "").replace("]", "").replace(" ", "");
        String[] parts = cleaned.split(",");
        
        int[] numbers = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }
        System.out.println(secondLargest(numbers));
            scanner.close();
    }
}
