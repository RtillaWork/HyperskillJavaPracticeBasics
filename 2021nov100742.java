import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamUtils {

    public static Stream<Integer> generateStreamWithPowersOfTwo(int n) {
//         return Stream.iterate(0, p += 1).map(p -> (int) Math.pow(2, p)).limit(n); // replace it with your code
            return Stream.iterate(1, p -> p *= 2).limit(n); 
    }
}
