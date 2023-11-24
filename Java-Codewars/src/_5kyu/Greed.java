package _5kyu;

/*
 * 
 * Challenge: (5kyu) Greed is Good
 * https://www.codewars.com/kata/5270d0d18625160ada0000e4/java
 * Description:
 * 
 *  Greed is a dice game played with five six-sided dice. Your mission, should you choose to
 *  accept it, is to score a throw according to these rules. You will always be given an array
 *  with five six-sided dice values.
 * 
 *    Three 1's => 1000 points
 *    Three 6's =>  600 points
 *    Three 5's =>  500 points
 *    Three 4's =>  400 points
 *    Three 3's =>  300 points
 *    Three 2's =>  200 points
 *    One   1   =>  100 points
 *    One   5   =>   50 points
 * 
 *  A single die can only be counted once in each roll. For example, a given "5" can only count as part
 *  of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.
 * 
 *  Example scoring
 *    Throw       Score
 *    ---------   ------------------
 *    5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 *    1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 *    2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
 * 
 *  In some languages, it is possible to mutate the input to the fuction. This is something that you
 *  should never do. If you mutate the input, you will not be able to pass all the tests.
 * 
 */

import java.util.HashMap;

public class Greed {
    
    public static int getPoints(int input) {
        switch (input) {
            case 1: return 1000;
            case 6: return 600;
            case 5: return 500;
            case 4: return 400;
            case 3: return 300;
            case 2: return 200;
            default: return 0;
        }
    }

    public static int greedy(int[] dice) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int out = 0;

        for (int i = 0; i < dice.length; i++) {
            int count = map.getOrDefault(dice[i], 0) + 1;

            if (count == 3) {
                out += getPoints(dice[i]);
                count = 0;
            }

            map.put(dice[i], count);
        }

        out += (map.getOrDefault(1, 0) * 100) + (map.getOrDefault(5, 0) * 50);
        return out;

    }

}
