package Laba4;
import java.io.*;

public class ExceptionLogger {
    
    public static void logException(Exception e) {
        try {
            FileWriter writer = new FileWriter("errors.log", true);
            writer.write("Ошибка: " + e.getClass().getSimpleName() + "\n");
            writer.write("Сообщение: " + e.getMessage() + "\n");
            writer.write("Время: " + new java.util.Date() + "\n");
            writer.write("---\n");
            writer.close();
        } catch (IOException ioException) {
            System.out.println("Не удалось записать в лог: " + ioException.getMessage());
        }
    }
}