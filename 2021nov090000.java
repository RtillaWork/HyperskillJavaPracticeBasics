import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void iterateOverList(ListIterator<String> iter) {
        // write your code here
        final String WORD_TO_FIND = "Hip";
        final String WORD_TO_INSERT = "Hop";
        while (iter.hasNext()) {
            String word = iter.next();
            if (WORD_TO_FIND.equals(word)) {
                iter.add(WORD_TO_INSERT);
            }
        }
    }

    public static void printList(ListIterator<String> iter) {
        // write your code here
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        iterateOverList(list.listIterator());
        printList(list.listIterator());
    }
}
