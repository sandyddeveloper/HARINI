public class Q_6 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 47, 9};
        int sum = 0;  


        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
