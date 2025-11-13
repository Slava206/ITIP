import java.util.Scanner;
import java.util.Arrays;

/* Создайте программу, которая принимает две строки и возвращает true, если одна является анаграммой другой (содержит те же буквы в любом порядке).
Игнорируйте регистр букв. */

public class Task3_5 {
    public static boolean isAnagram(String str1, String str2){
        if (str1 == null || str2 == null || str1.length() != str2.length()){
            return false;
        }

        String s1 = str1.toLowerCase().replaceAll("\\s+", "");
        String s2 = str2.toLowerCase().replaceAll("\\s+", "");

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();
        String[] words = input.split(",");

        String word1 = words[0].trim();
        String word2 = words[1].trim();

        boolean result = isAnagram(word1, word2);
        System.out.println(result);

        scanner.close();
    }
}
