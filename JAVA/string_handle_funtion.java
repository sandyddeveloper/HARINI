public class StringHandler {

    // Method to demonstrate string handling
    public static void handleString(String input) {
        harini
        // Check for null or empty string
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        // Convert to uppercase
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert to lowercase
        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        // Get the length of the string
        int length = input.length();
        System.out.println("Length: " + length);

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // Check if the string is a palindrome
        boolean isPalindrome = input.equalsIgnoreCase(reversed);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Replace a character
        String replaced = input.replace('a', '@');
        System.out.println("Replaced 'a' with '@': " + replaced);

        // Split the string into words
        String[] words = input.split("\\s+");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Find a substring
        String substring = input.substring(0, Math.min(5, input.length()));
        System.out.println("Substring (first 5 characters): " + substring);

        // Check if string contains a specific word
        boolean containsJava = input.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);
    }

    public static void main(String[] args) {
        // Test the handleString method
        String input = "Java is amazing!";
        handleString(input);
    }
}


harini
WOW WOW
inirah
h@rini

harini is a developer
harini 
is 
a 
developer


this is sentence
