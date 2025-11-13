import java.util.Scanner;

// Создайте программу, которая принимает строку и возвращает её со словами в обратном порядке. Все слова разделены пробелами.

public class Task3_1 {

    public static String reverseWords(String text) {
        String[] words = text.split(" ");
        String result = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) {
                result += " ";
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(reverseWords(input));
        scanner.close();
    }
}