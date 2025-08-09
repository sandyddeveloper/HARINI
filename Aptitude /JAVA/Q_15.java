public class Q_15 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 3, 47, 9};
        int target = 47;
        int index = -1;  

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
