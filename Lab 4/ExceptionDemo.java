package Laba4;
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Демонстрация обработки исключений\n");
        
        // Разные случаи
        testNumberConversion("123");
        testNumberConversion("abc");
        testNumberConversion("12.34");
        testNumberConversion("100L");
    }
    
    public static void testNumberConversion(String text) {
        try {
            int number = convertToNumber(text);
            System.out.println("Успех: '" + text + "' -> " + number);
        } catch (CustomNumberFormatException e) {
            System.out.println("Ошибка: '" + text + "' - " + e.getMessage());
            ExceptionLogger.logException(e);
        }
    }
    
    public static int convertToNumber(String text) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException(
                "Не могу преобразовать в число", 
                text
            );
        }
    }
}


//java ExceptionDemo.java