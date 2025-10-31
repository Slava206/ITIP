import java.util.Scanner;
import java.util.HashSet;

public class Task2_4 {
    
    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("false");
            scanner.close();
            return;
        }
        
        String[] numbersStr = input.split(",");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i].trim());
        }
        System.out.println(hasDuplicates(numbers));
        scanner.close();
    }
}