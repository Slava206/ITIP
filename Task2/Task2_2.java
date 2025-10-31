import java.util.Scanner;

public class Task2_2 {
    public static int sumRange(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] numbers = input.split(",");
        
        int a = Integer.parseInt(numbers[0].trim());
        int b = Integer.parseInt(numbers[1].trim());
        
        System.out.println(sumRange(a, b));
        
        scanner.close();
    }
}
