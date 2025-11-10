package Laba5;

// Задание 2. Проверка корректности ввода пароля

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordValidator {
    
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите пароль для проверки: ");
            String password = scanner.nextLine();
            
            if (isValidPassword(password)) {
                System.out.println("Пароль корректен!");
            } else {
                System.out.println("Пароль не соответствует требованиям!");
                analyzePassword(password);
            }
            
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    // Проверка с помощью регулярного выражения
    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        
        try {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
            
        } catch (Exception e) {
            System.out.println("Ошибка при проверке пароля: " + e.getMessage());
            return false;
        }
    }
    
    public static void analyzePassword(String password) {
        if (password == null) {
            System.out.println("Пароль не может быть пустым");
            return;
        }
                
        // Проверка длины
        if (password.length() < 8) {
            System.out.println("- Слишком короткий (меньше 8 символов)");
        } else if (password.length() > 16) {
            System.out.println("- Слишком длинный (больше 16 символов)");
        }
        
        // Проверка на наличие заглавных букв
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("- Отсутствует заглавная буква");
        }
        
        // Проверка на наличие цифр
        if (!password.matches(".*\\d.*")) {
            System.out.println("- Отсутствует цифра");
        }
        
        // Проверка на допустимые символы
        if (!password.matches("[A-Za-z\\d]*")) {
            System.out.println("- Содержит недопустимые символы (разрешены только латинские буквы и цифры)");
        }
    }
}





// java PasswordValidator.java