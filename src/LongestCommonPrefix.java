public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //Write a function to find the longest common prefix string amongst an array of strings.
        //
        //If there is no common prefix, return an empty string "".

        // If the array is null or empty, there is no prefix
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the reference string
        // Any common prefix must be a prefix of this string
        String first = strs[0];

        // Loop through each character index of the first string
        for (int i = 0; i < first.length(); i++) {
            // Current character from the first string to compare
            char ch = first.charAt(i);

            // Compare this character with the same index in all strings
            for (String str : strs) {
                // If the current string is shorter than index i
                // OR characters do not match
                // then the common prefix ends here
                if(i >= str.length() || str.charAt(i) != ch){
                    // Return the prefix from index 0 up to (but not including) i
                    return first.substring(0,i);
                }
            }
        }
        // If no mismatch is found, the entire first string is the common prefix
        return first;
    }
}
