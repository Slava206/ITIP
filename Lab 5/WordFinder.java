package Laba5;

// Задание 5. Поиск всех слов, начинающихся с заданной буквы

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "CP866");

        try {
            System.out.println("Введите текст:");
            String text = scanner.nextLine();
            
            System.out.println("Введите букву:");
            String letter = scanner.nextLine();

            if (letter.length() != 1){
                System.out.println("Ошибка: нужно ввести одну букву");
                return;
            }

            List<String> foundWords = findWordsWith(text, letter);

            if (foundWords.isEmpty()){
                System.out.println("Слова, начинающиеся с буквы '" + letter + "' не найдены.");
            } else {
                System.out.println("Найденные слова, начинающиеся с '" + letter + "':");
                for (String word : foundWords){
                    System.out.println("- " + word);
                }
                System.out.println("Всего найдено: " + foundWords.size() + " слов(а)");
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static List<String> findWordsWith(String text, String letter){
        List<String> words = new ArrayList<>();

        if (text == null || text.isEmpty() || letter == null || letter.isEmpty()){
            return words;
        }

        try {
            String regex = "\\b" + letter + "[а-яА-Яa-zA-Z]*\\b";
            Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CASE | Pattern.UNICODE_CHARACTER_CLASS); // регистронезависимый поиск, unicode символы и классы
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                words.add(matcher.group());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при поиске слов: " + e.getMessage());
        }
        return words;
    }
}




// java WordFinder.java