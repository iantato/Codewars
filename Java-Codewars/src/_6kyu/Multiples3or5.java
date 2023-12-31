package _6kyu;

/*
 * 
 * Challenge: (6kyu) Multiples of 3 or 5
 * https://www.codewars.com/kata/514b92a657cdc65150000006
 * 
 * Description:
 * 
 *  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9.
 *  The sum of these multiples is 23. Finish the solution so that it returns the sum of all the
 *  multiples of 3 or 5 below the number passed in.
 * 
 *  Note: If the number is multiple of both 3 and 5, only count it once.
 * 
 *  Courtesy of projecteuler.net (Problem 1)
 * 
 */

public class Multiples3or5 {
    
    public int solution(int number) {
        
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }

        return sum;
    }

}
