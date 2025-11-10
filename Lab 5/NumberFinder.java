package Laba5;

// Задание 1. Поиск всех чисел в тексте

import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "Мой рост 175.5 см, вес 60.2 кг, возраст 19 лет";
        
        try {
            Pattern pattern = Pattern.compile("-?\\d+\\.\\d+|-?\\d+");
            Matcher matcher = pattern.matcher(text);
            
            System.out.println("Найденные числа:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
            
        }
        
        catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}






// java NumberFinder.java