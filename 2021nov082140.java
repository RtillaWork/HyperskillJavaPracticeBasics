import java.util.Iterator;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {
        // write your code here

        Iterator<Long> iter = new Iterator<Long>() {
            long i = fromInclusive;

            @Override
            public boolean hasNext() {
                if (i < toExclusive) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Long next() {
                return i++;
            }
        };

        return iter;
    }
}


// Iterable range
// In this problem you need to create your own iterator but the theory has not given an example for it. You may skip the problem or google how to do that. Actually, the problem is not complicated.
// Given a class named Range. It represents a range from A (inclusive) to B (exclusive). The class implements the interface Iterable, therefore, an instance of Range can be used in the for-each loop.

// Write a body of the overridden method iterator so that the following code works correctly:

// Range range = new Range(2, 6);

// for (Long val : range) {
//     System.out.println(val);
// }
// It must print:

// 2
// 3
// 4
// 5

// Sample Input:
// 2 6

// Sample Output:
// 2
// 3
// 4
// 5



// Memory limit: 256 MB
// Time limit: 8 seconds

// Caution

// You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
