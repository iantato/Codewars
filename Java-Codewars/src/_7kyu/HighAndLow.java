package _7kyu;

/*
 * 
 * Challenge: (7kyu) Highest and Lowest
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 * 
 * Description:
 * 
 *  In this little assignment you are given a string of space separated numbers, and have to return
 *  the highest and lowest number.
 * 
 *  Examples
 *    highAndLow("1 2 3 4 5")  // return "5 1"
 *    highAndLow("1 2 -3 4 5") // return "5 -3"
 *    highAndLow("1 9 3 4 -5") // return "9 5"
 * 
 *  Notes
 *   - All numbers are valid Int32, no need to validate them.
 *   - There will always be at least one number in the input string.
 *   - Output string must be two numbers separated by a single space, and
 *     highest number is first.
 * 
 */

public class HighAndLow {
    
    public static String highAndLow(String numbers) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        String[] numArr = numbers.split(" ");

        for (int i = 0; i < numArr.length; i++) {
            int val = Integer.parseInt(numArr[i]);

            if (val > max) max = val;
            if (val < min) min = val;
        }

        return max + " " + min;
    }

}
