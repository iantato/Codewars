package _8kyu;

/*
 * 
 * Challenge: (8kyu) Counting sheep...
 * https://www.codewars.com/kata/54edbc7200b811e956000556
 * 
 * Description:
 * 
 *  Consider an array/list of sheep where some sheep may be missing from their place. We need a
 *  function that counts the number of sheep present in the array (true means present).
 * 
 *  For example,
 *    [true,  true,  true,  false,
 *     true,  true,  true,  true ,
 *     true,  false, true,  false,
 *     true,  false, false, true ,
 *     true,  true,  true,  true ,
 *     false, false, true,  true]
 * 
 *  The correct answer would be 17.
 * 
 *  Hint: Don't forget to check for bad values like null/undefined
 * 
 */

public class Counter {
    
    public int CountSheeps(Boolean[] arrayOfSheeps) {
        int ctr = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i] != false) ctr++;
        }
        
        return ctr;
    }
}
