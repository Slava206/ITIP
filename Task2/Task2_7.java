import java.util.Scanner;
public class Task2_7 {
    public static int[] countEvenOddDigits(int n){
        n = Math.abs(n);
        int eCount = 0;
        int oCount = 0;

        if (n == 0){
            return new int[] {1, 0};
        }
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0){
                eCount ++;
            } else {
                oCount ++;
            }
            n = n / 10;
        }
        return new int[]{eCount, oCount};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] result = countEvenOddDigits(num);
        System.out.println(result[0] + ", " + result[1]);
        scanner.close();
    }
}
