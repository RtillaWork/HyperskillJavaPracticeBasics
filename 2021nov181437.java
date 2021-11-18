import java.util.*;

public class Main {

    public static void main(String[] args) {    
        // write your code here
        Map<String, Integer> map = new TreeMap<>(Map.of("Omega", 24, "Alpha", 1, "Gamma", 3));
        System.out.println(map);
    }
}




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma",  3);
        map.put("Omega", 24);
        map.put("Alpha",  1);

        // write your code here
        map.forEach((k, v) -> System.out.printf("%s=%d\n", k, v));
    }
}


