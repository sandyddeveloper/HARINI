public class Q_18 {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 25, 47, 50};
        boolean isSorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
