package _5kyu;

/*
 * 
 * Challenge: (5kyu) Simple Pig Latin
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 * 
 * Description:
 * 
 *  Move the first letter of each word to the end of it, then add "ay" 
 *  to the end of the word. Leave punctuation marks untouched.
 * 
 *  Examples
 *    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 *    pigIt('Hello world !');     // elloHay orldway !
 * 
 */

public class PigLatin {

    public static String pigIt(String str) {

        String[] sentence = str.split(" ");
        String resultString = "";

        for (int i = 0; i < sentence.length; i++) {
            char firstLet = sentence[i].charAt(0);

            if ((firstLet >= 'a' && firstLet <= 'z') || (firstLet >= 'A' && firstLet <= 'Z')) {
                resultString += sentence[i].substring(1) + firstLet + "ay";
            } else {
                resultString += sentence[i];
            }
            if (i != sentence.length - 1) resultString += " ";
        }

        return resultString;
    }
}
