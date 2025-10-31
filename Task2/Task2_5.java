import java.util.Scanner;

public class Task2_5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        
        int bracketIndex = input.indexOf("]");
        if (bracketIndex == -1) {
            return;
        }

        String arrayStr = input.substring(1, bracketIndex).replace(" ", "");
        String shiftStr = input.substring(bracketIndex + 1).replace(",", "").trim();
        String[] numbers = arrayStr.split(",");
        int[] arr;
        
        if (arrayStr.isEmpty()) {
            arr = new int[0];
        } else {
            arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }
        }
        
        int k = Integer.parseInt(shiftStr);
        
        if (arr.length > 0) {
            k = k % arr.length;
        }
        
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + k) % arr.length;
            result[newIndex] = arr[i];
        }
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}