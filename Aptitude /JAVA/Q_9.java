public class Q_9 {
     public static void main(String[] args) {
        String sentence = "Hello there, how are you?";
        int wordCount = 0;

        String[] words = sentence.split(" ");

        wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}


