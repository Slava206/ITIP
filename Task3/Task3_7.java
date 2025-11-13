import java.util.Scanner;

// Создайте программу, которая считает количество слов в строке. Слова разделяются одним или несколькими пробелами.

public class Task3_7 {
    public static int countWords(String text){
        if (text == null || text.trim().isEmpty()){
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(countWords(input));
        scanner.close();
    }
}
