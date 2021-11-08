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
        for(int i = 0; i < d; i++) {
            dict.add(sc.nextLine());
        }

        // Input text lines
        Set<String> txt = new HashSet<>();
        int l = sc.nextInt();
        for(int i = 0; i < l; i++) {
            txt.addAll(Arrays.stream(sc.nextLine().split("\\s+")).collect(Collectors.toSet()));
        }
        
        // Words from txt not in dict
        Set<String> misspelled = new HashSet<>(txt);
        misspelled.removeAll(dict);
        
        // Display
        misspelled.forEach(elem -> System.out.println(elem));
    }
}
