import java.util.Scanner;

public class Task2_8 {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        String input = scanner.nextLine();        
        input = input.substring(1, input.length() - 1);        
        String[] rows = input.split("],\\[");
        int[][] matrix = new int[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i].replace("[", "").replace("]", "").replace(" ", "");
            String[] numbers = row.split(",");
            matrix[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }        
        System.out.println(diagonalSum(matrix));
        scanner.close();
    }
}