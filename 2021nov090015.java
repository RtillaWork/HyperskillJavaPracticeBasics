import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        // write your code here
        List<String> strings = new ArrayList(List.of(array));
        ListIterator iter = strings.listIterator();

        while (iter.hasNext()) {
            String string = iter.next().toString();
            if (!string.startsWith("J")) {
                iter.remove();
            }
        }

        // Rewind
        while (iter.hasPrevious()) {
            iter.previous();
        }
        while (iter.hasNext()) {
            String string = iter.next().toString();
            string = string.substring(1);
            iter.set(string);
        }

        while (iter.hasPrevious()) {
           System.out.println(iter.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}



// No "J"
// Implement a method that does the following algorithm:

// creates List<String> from a given array of strings;
// using ListIterator, removes all items not starting with "J" ;
// removes "J" from items beginning with "J" (e.g., JFrame -> Frame);
// prints all the remaining elements in the reverse order.

// Sample Input:
// ImageButton JTextField JTextArea CheckBox JMenu

// Sample Output:
// Menu
// TextArea
// TextField



// Memory limit: 256 MB
// Time limit: 8 seconds
