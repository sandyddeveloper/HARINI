public class StringBufferExample {

    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Display the original string
        System.out.println("Original String: " + sb);

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific index
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Display the capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());
    }
}
