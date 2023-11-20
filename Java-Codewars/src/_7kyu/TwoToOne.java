package _7kyu;

/*
 * 
 * Challenge: (7kyu) Two to One
 * https://www.codewars.com/kata/5656b6906de340bd1b0000ac
 * 
 * Description:
 * 
 *  Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest
 *  possible, containing distinct letters - each taken only once - coming from s1 or s2.
 * 
 *  Examples:
 *    a = "xyaabbbccccdefww"
 *    b = "xxxxyyyyabklmopq"
 *    longest(a, b) -> "abcdefklmopqwxy"
 * 
 *    a = "abcdefghijklmnopqrstuvwxyz"
 *    longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 * 
 */

import java.util.Arrays;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        
        String str = s1 + s2, sorted_string = "";
        char[] chrs = str.toCharArray();
        Arrays.sort(chrs);

        for (char chr : chrs) {
            if (sorted_string.indexOf(chr) == -1) sorted_string += chr;
        }

        return sorted_string;
    }
}
