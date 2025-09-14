public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " - Палиндром");
            }
            else {
                System.out.println(s + " - Не палиндром");
            }
        }
    }
    
    // Метод для переворота строки
    public static String reverseString(String s) {
        String revers = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revers += s.charAt(i);
        }
        return revers;
    }

    // Метод для проверки на палиндром
    public static boolean isPalindrome(String s) {
            String revers = reverseString(s);
            return s.equals(revers);
    }
}