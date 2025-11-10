package Laba5;

// Задание 4. Проверка корректности ввода IP-адреса

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IPAddressValidator {
    private static final String IP_PATTERN = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите IP адрес:");
            String ipAddress = scanner.nextLine().trim();

            if (isValidIPAddress(ipAddress)){
                System.out.println("IP-адрес корректен!");
            } else {
                System.out.println("IP-адрес неверен!");
                analyzeIP(ipAddress);
            }

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally{
            scanner.close();
        }
    }

    public static boolean isValidIPAddress(String ipAddress){
        if (ipAddress == null || ipAddress.isEmpty()){
            return false;
        }

        try {
            Pattern pattern = Pattern.compile(IP_PATTERN);
            Matcher matcher = pattern.matcher(ipAddress);
            return matcher.matches();

        } catch (Exception e) {
            System.out.println("Ошибка при проверке IP-адреса: " + e.getMessage());
            return false;
        }
    }

    public static void analyzeIP(String ipAddress){
        if (ipAddress == null || ipAddress.isEmpty()){
            System.out.println("IP-адрес не может быть пустым");
            return;
        }

        String[] parts = ipAddress.split("\\.");
        if (parts.length != 4){
            System.out.println("Неверное количество октетов: " + parts.length);
            return;
        }

        for (int i = 0; i < parts.length; i++){
            String octet = parts[i];

            try {
                int value = Integer.parseInt(octet);
                if (value < 0 || value > 255){
                    System.out.println("Октет " + (i + 1) + "(" + octet + ") вне диапазона 0-255");
                }
            } catch (NumberFormatException e) {
                System.out.println("Октет " + (i + 1) + " (" + octet + ") не является числом");
            }
        }

        if (!ipAddress.matches("[0-9.]+")){
            System.out.println("Содержит недопустимые символы");
        }
    }
}






//java IPAddressValidator.java