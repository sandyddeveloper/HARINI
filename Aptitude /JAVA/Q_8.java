public class Q_8 {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
