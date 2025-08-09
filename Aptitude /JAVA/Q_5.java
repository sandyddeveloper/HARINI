public class Q_5 {
      public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 47, 9};
        int smallest = numbers[0];  

       
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];  
            }
        }

        System.out.println("The smallest element is: " + smallest);
    }
}
