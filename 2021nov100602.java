import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
        List<? extends T> ts = stream.collect(Collectors.toList());
        List<? extends T> dupTs = new ArrayList<>(ts);

        minMaxConsumer.accept(ts.stream().min(order).orElse(null),
                dupTs.stream().max(order).orElse(null));

    }
}
// Implement a method for finding min and max elements of a stream in accordance with a given comparator.

// The found elements pass to minMaxConsumer in the following way:

// minMaxConsumer.accept(min, max);
// If the stream doesn't contain any elements, invoke:

// minMaxConsumer.accept(null, null);
// Remember, that as soon as you call any terminal operation, the stream is closed and you can get IllegalStateException.
