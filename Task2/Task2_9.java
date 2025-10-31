import java.util.*;

public class Task2_9 {
    
    public static int[] mergeUniqueSorted(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) result[index++] = num;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        String[] arrays = input.split("\\], \\[");
        
        String array1Str = arrays[0].replace("[", "").replace("]", "").trim();
        int[] a = array1Str.isEmpty() ? new int[0] : parseArray(array1Str);
        
        String array2Str = arrays[1].replace("[", "").replace("]", "").trim();
        int[] b = array2Str.isEmpty() ? new int[0] : parseArray(array2Str);
        
        int[] result = mergeUniqueSorted(a, b);
        
        // Вывод без пробелов
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
    
    public static int[] parseArray(String str) {
        if (str.isEmpty()) return new int[0];
        String[] parts = str.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }
}