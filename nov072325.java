import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        // Input dictionary words
        Set<String> dict = new HashSet<>();
        int d = sc.nextInt();
        sc.nextLine(); // skip to next line

        for(int i = 0; i < d; i++) {
            dict.add(sc.nextLine());
        }

        // Normalize dict for case insensitivity
        dict = dict.stream().map(String::toLowerCase).collect(Collectors.toSet());
        // System.out.println(dict);

        // Input text lines
        Set<String> txt = new HashSet<>();
        int l = sc.nextInt();
        sc.nextLine(); // skip to next line

        for(int i = 0; i < l; i++) {
            txt.addAll(Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toSet()));
        }

        // System.out.println(txt);

        // Words from lower-case normalized txt not in dict
        Set<String> misspelled = new HashSet<>(txt.stream().map(String::toLowerCase).collect(Collectors.toSet()));
        misspelled.removeAll(dict);

        // Display
        misspelled.forEach(elem -> System.out.println(elem));
    }
}
