public class Q_4 {
        public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 47, 9};
        int largest = numbers[0];  

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  
            }
        }

        System.out.println("The largest element is: " + largest);
    }
}
