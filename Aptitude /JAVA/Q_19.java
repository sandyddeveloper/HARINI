public class Q_19 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 25, 9, 10, 47};

        System.out.println("Unique elements:");

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
