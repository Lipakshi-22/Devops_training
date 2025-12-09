public class prac4 {
    public static void main(String[] args) {
        String str = "Hello world, welcome to Java";

        // Trim the string to remove leading/trailing spaces
        str = str.trim();

        // Split the string by spaces
        String[] words = str.split("\\s+");

        // Count words
        int count = words.length;

        System.out.println("Number of words: " + count);
    }
}
