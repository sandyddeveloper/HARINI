public class Q_3 {
        public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        // We are reversing the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check if original string and reversed string are equal
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
