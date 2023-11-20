package _8kyu;

/*
 * 
 * Challenge: (8kyu) String repeat
 * https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
 * 
 * Description:
 * 
 *  Write a function that accepts an integer n and a string s as parameters, 
 *  and returns a string of s repeated exactly n times.
 * 
 *  Example (input -> output)
 *    6, "I"     -> "IIIIII"
 *    5, "Hello" -> "HelloHelloHelloHelloHello"    
 * 
 */

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
