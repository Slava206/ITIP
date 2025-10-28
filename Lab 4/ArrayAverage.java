package Laba4;
public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};
        
        try {
            int sum = 0;
            
            for (int i = 0; i < arr.length; i++) {
                try {
                    // Пытаемся преобразовать в число
                    int num = Integer.parseInt(arr[i]);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: элемент '" + arr[i] + "' не число");
                }
            }
            
            // Вычисляем среднее
            double average = (double) sum / arr.length;
            System.out.println("Среднее арифметическое: " + average);
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}


//java ArrayAverage.java