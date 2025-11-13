import java.util.Scanner;
import java.util.Arrays;

// Создайте программу, которая принимает массив чисел и возвращает новый массив, содержащий только чётные числа.

public class Task3_6 {
    
    public static int[] filterEven(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) count++;
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        
        return result;
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
        
        int[] result = filterEven(numbers);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
