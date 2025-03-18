class PROBLEM_1 {
    

    public String mergeAlternately(String word1, String word2) {

        // Find the minimum length of the two strings
        int minLength = Math.min(word1.length(), word2.length());

        // Create a StringBuilder to store the result
        StringBuilder sb = new StringBuilder();

        // Iterate through the strings and append the characters alternately
        for (int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        // Append the remaining characters from the longer string
        if (minLength < word1.length()) {
            sb.append(word1.substring(minLength));
        } else if (minLength < word2.length()) {
            sb.append(word2.substring(minLength));
        }
        System.out.println(sb.toString());
        return sb.toString();

    }
} 
//SOLVED 
