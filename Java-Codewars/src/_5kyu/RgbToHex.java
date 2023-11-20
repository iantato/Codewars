package _5kyu;

/*
 * 
 * Challenge: (5kyu) RGB To Hex Conversion
 * https://www.codewars.com/kata/513e08acc600c94f01000001
 * Description:
 *  
 *  The rgb function is incomplete. Complete it so that passing in RGB decimal values will result
 *  in a hexadecimal representation being returned. Valid decimal values for RGB are 0-255. Any
 *  values that fall out of that range must be rounded to the closest valid value.
 *  
 *  Note: Your answer should always be 6 characters long, the short hand with 3 will not work here.
 *  
 *  Examples (input --> output):
 *    255, 255, 255 --> "FFFFFF"
 *    255, 255, 300 --> "FFFFFF"
 *    0, 0, 0       --> "000000"
 *    148, 0, 211   --> "9400D3"
 * 
 */

import java.util.HashMap;

public class RgbToHex {
    
    public static String decimalToHexa(String n) {
        HashMap<String, String> values = new HashMap<String, String>();

        values.put("10", "A");
        values.put("11", "B");
        values.put("12", "C");
        values.put("13", "D");
        values.put("14", "E");
        values.put("15", "F");

        return (Integer.parseInt(n) >= 10) ? values.get(n) : n;
    }

    public static String rgb(int r, int g, int b) {
        
        if (r > 255) r = 255;
        if (g > 255) g = 255;
        if (b > 255) b = 255;

        if (r < 0) r = 0;
        if (g < 0) g = 0;
        if (b < 0) b = 0;

        String hex = decimalToHexa(String.valueOf(r / 16)) + decimalToHexa(String.valueOf(r % 16)) +
                     decimalToHexa(String.valueOf(g / 16)) + decimalToHexa(String.valueOf(g % 16)) +
                     decimalToHexa(String.valueOf(b / 16)) + decimalToHexa(String.valueOf(b % 16));
        
        return hex;
    }

}
