public class Q_2 {
    public static void main(String[] args) {
        String input = "Hello World";
        int count = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Inga we r Check if the character is a vowel 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
    
}

