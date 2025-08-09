public class Q_7 {
     public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 47, 9, 25, 3, 10};
        System.out.println("Duplicate elements are:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break; 
                }
            }
        }
    }
}
