package _8kyu;

/*
 * 
 * Challenge: (8kyu) A Needle in the Haystack
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
 * 
 * Description:
 * 
 *  Can you find the needle in the haystack?
 * 
 *  Write a function findNeedle() that takes an array full of junk but containing one "needle".
 * 
 *  After your function finds the needle it should return a message (as a string) that says:
 *  "found the needle at position " plus the index it found the needle, so:
 * 
 *  Example (Input --> Output)
 *    ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5" 
 * 
 *  Note: In COBOL, it should return "found the needle at position 6"
 * 
 */

public class NeedleHaystack {
    
    public static String findNeedle(Object[] haystack) {
        
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") return "found the needle at position " + (i);
        }

        return "No needle.";
    }

}
