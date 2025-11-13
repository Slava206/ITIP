import java.util.Scanner;

// Создайте программу, которая считает количество гласных букв (a, e, i, o, u) в строке.

public class Task3_2 {
    public static int countVowels(String text){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++){
            if (vowels.indexOf(text.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countVowels(input));

        scanner.close();
    }
}
