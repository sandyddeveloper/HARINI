public class Q_20 {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";
        String[] words = sentence.split(" ");
        int maxLength = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }

        System.out.println("Length of the longest word: " + maxLength);
    }
}
