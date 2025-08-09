public class Q_14 {
     public static void main(String[] args) {
        String input = "hello world";
        input = input.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ch) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(ch + ": " + count);
            }
        }
    }
}
