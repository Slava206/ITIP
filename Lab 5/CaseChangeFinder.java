package Laba5;

// Задание 3. Поиск заглавной буквы после строчной

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CaseChangeFinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите текст для анализа:");
        String text = scanner.nextLine();
        
        try {
            String result = findCaseChanges(text);
            System.out.println("Результат:");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static String findCaseChanges(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);
        
        String result = matcher.replaceAll("$1!$2!");
        
        return result;
    }
}





//java CaseChangeFinder.java