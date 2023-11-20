package _6kyu;

/*
 * 
 * Challenge: (6kyu) Stop gninnipS My sdroW!
 * https://www.codewars.com/kata/5264d2b162488dc400000001
 * 
 * Description:
 * 
 *  Write a function that takes in a string of one or more words, and returns the same string, but
 *  with all five or more letter words reversed (Just like the name of this Kata). Strings passed
 *  in will consist of only letters and spaces. Spaces will be included only when more than one word
 *  is present.
 * 
 *  Examples:
 *    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 *    spinWords( "This is a test" ) => "This is a test"
 *    spinWords( "This is another test" ) => "This is rehtona test"
 * 
 */

public class SpinWords {
    
    public String spinWords(String sentence) {

        String[] strArr = sentence.split(" ");
        String result = "";

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() >= 5) {
                String reversed = "";
                
                for (int j = 0; j < strArr[i].length(); i++) {
                    reversed = strArr[i].charAt(j) + reversed;
                }
            } else {
                result += strArr[i];
            }

            if (i != strArr.length - 1) result += " ";
        }

        return result;
    }
}
