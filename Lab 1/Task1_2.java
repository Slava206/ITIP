import java.util.Scanner;

//Площадь прямоугольника

public class Task1_2 {
    
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        double area = rectangleArea(length, width);
        System.out.println(area);
        scan.close();
    }

}
