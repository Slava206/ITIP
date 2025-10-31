import java.util.Scanner;
public class Task2_6 {
    public static int clamp(int value, int min, int max){
        if (value < min){
            return min;
        } else if (value > max){
            return max;
        } else {
            return value;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int value = Integer.parseInt(parts[0].trim());
        int min = Integer.parseInt(parts[1].trim());
        int max = Integer.parseInt(parts[2].trim());
        System.out.println(clamp(value, min, max));
        scanner.close();
    }
}