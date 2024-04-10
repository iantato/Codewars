package _4kyu;

/*
 * 
 * Challenge: (4kyu) Text align justify
 * https://www.codewars.com/kata/537e18b6147aa838f600001b/train/java
 * 
 * Description:
 *  Your task in this Kata is to emulate text justification in monospace font. 
 *  You will be given a single-lined text and the expected justification width. 
 *  The longest word will never be greater than this width.
 * 
 *  Here are the rules:
 *    - Use spaces to fill in the gaps between words.
 *    - Each line should contain as many words as possible.
 *    - Use '\n' to separate lines.
 *    - Gap between words can't differ by more than one space.
 *    - Lines should end with a word not a space.
 *    - '\n' is not included in the length of a line.
 *    - Large gaps go first, then smaller ones ('Lorem--ipsum--dolor--sit-amet,' (2, 2, 2, 1 spaces)).
 *    - Last line should not be justified, use only one space between words.
 *    - Last line should not contain '\n'
 *    - Strings with one word do not need gaps ('somelongword\n').
 * 
 */

public class TextAlign {
    
    public static void main(String[] args) {
        System.out.println(justify("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
        + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
        + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
        + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
        + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
        + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
        + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
        + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
        + " et dolor.", 30));
    }
    
    public static String justify(String text, int width) {

        String[] words = text.split(" ");
        int length = 0;
        String out = "";
        
        for (int i = 0; i < words.length; i++) {
            
            length += words[i].length();
            if (length > width) {
                out += "\n";
                out += words[i];
                System.out.println((30 - (length - words[i].length())));
                length = words[i].length();
            } else out += words[i];
        
        }

        System.out.println(out);

        return "";
    }
}
