package com.example.exercises;

public class StringDrill {



    /**
     * Checks if a given string is a palindrome.
     * @param input the string to check
     * @return true if it is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        // 1. Normalize the string: lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll(" ", "");

        // 2. Reverse the string
        String reversed = new StringBuilder(normalized).reverse().toString();

        // 3. Compare normalized with reversed
        return normalized.equals(reversed);
    }



    /**
    * Replaces all vowels in the input string with '*'.
    * @param input the original string
    * @return a new string with all vowels replaced
    */
    public static String replaceVowels(String input){
    return input.replaceAll ("[aeiouAEIOU]","*");
    }



    /**
     * Capitalizes the first letter of each word in a sentence.
     * @param sentence the input sentence
     * @return a sentence with each word capitalized
     */
     public static String capitalizeWords(String sentence){

         //use split and loop through the words
         String[] words = sentence.split(" ");
         StringBuilder result = new StringBuilder();

         for (String word : words) {
             if (!word.isEmpty()){
                 String capitalized = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
                 result.append(capitalized).append(" ");
             }
         }
         return result.toString().trim();
     }





    /**
     * Counts how many times a specific word appears in the sentence (case-insensitive).
     * @param sentence full sentence
     * @param word word to search
     * @return count of occurrences
     */
    public static int countWordOccurrences(String sentence, String word) {
         // Convert to lowercase and split
         String[] words = sentence.toLowerCase().split(" ");
         String target = word.toLowerCase();
         int count = 0;

         for (String w : words) {
             if(word.equals(target)){
                 count++;
             }
         }
         return count;
     }
     }
