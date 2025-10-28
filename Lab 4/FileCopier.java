package Laba4;
import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "copy.txt";
        
        // Создаем тестовый файл
        createTestFile(sourceFile);
        
        // Копируем файл
        copyFile(sourceFile, destFile);
    }
    
    public static void copyFile(String sourcePath, String destPath) {
        try {
            // Открываем файлы для чтения и записи
            FileInputStream input = new FileInputStream(sourcePath);
            FileOutputStream output = new FileOutputStream(destPath);
            
            System.out.println("Файлы открыты успешно");
            
            // Копируем данные
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            
            System.out.println("Файл скопирован успешно!");
            
            // Закрываем файлы
            input.close();
            output.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }
    }
    
    private static void createTestFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Привет! Это тестовый файл.\n");
            writer.write("Содержимое для копирования.\n");
            writer.write("Копирование прошло успешно!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Не удалось создать тестовый файл");
        }
    }
}


//java FileCopier.java