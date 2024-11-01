package Problem1957;

public class Solution {
    public static void main(String[] args) {
        String testcase1 = "leeetcode";
        String testcase2 = "aaabaaaa";
        String testcase3 = "aab";

        System.out.println(makeFancyString(testcase1));
        System.out.println(makeFancyString(testcase2));
        System.out.println(makeFancyString(testcase3));
    }

    public static String makeFancyString(String s) {
        if (s.length() <= 2) return s;

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // Count occurrences of the current character
            char currentChar = s.charAt(i);
            int count = 0;

            // Count how many consecutive characters are the same
            while (i < s.length() && s.charAt(i) == currentChar) {
                count++;
                i++;
            }

            // Append characters based on the count
            if (count == 1) {
                result.append(currentChar);
            } else {
                result.append(currentChar);
                if (count >= 2) {
                    result.append(currentChar); // Append the character twice
                }
            }
        }

        return result.toString();
    }

}
