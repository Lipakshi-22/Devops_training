import java.util.Arrays;
//this code to find the two strings are anagram or not 
public class prac3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: If lengths differ, not anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        // Step 2: Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}
