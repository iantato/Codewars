package _6kyu;

/*
 * 
 * Challenge: (6kyu) Duplicate Encoder
 * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 * 
 * Description:
 *  
 *  The goal of this exercise is to convert a string to a new string where each character in the new
 *  string is "(" if that character appears only once in the original string, or ")" if that character
 *  appears more than once in the original string. Ignore the capitalization when determining if a
 *  character is a duplicate.
 * 
 *  Examples
 *    "din"     => "((("
 *    "recede"  => "()()()"
 *    "Success" => ")())())"
 *    "(( @"    => "))(("
 * 
 */

public class DuplicateEncoder {
    
    static String encode(String word) {

        word = word.toLowerCase();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char let = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == let) count++;
            }

            result += (count >= 2) ? ")" : "(";
        }

        return result;
    }

}
