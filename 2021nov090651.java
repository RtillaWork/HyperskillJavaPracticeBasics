
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;        

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> sorted = new ArrayList<>(numbers);
        
        Comparator<Integer> sortOddEvenCompare = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                int comparison = 0;
                if (i1 % 2 != 0 && i2 % 2 == 0) {
                    comparison = -1;
                } else if (i1 % 2 != 0 && i2 % 2 != 0) {
                    comparison =  i1.compareTo(i2);
                } else if (i1 % 2 == 0 && i2 % 2 == 0) {
                    comparison =  i2.compareTo(i1);
                }
                return comparison;
            }
        };
        sorted.sort(sortOddEvenCompare);
        return sorted;
        }
    }

// Odd and even
// Write a method that takes a List of Integer numbers and returns a List containing the same Integer numbers sorted according to the following rules:
// In the sorted List, odd numbers should be at the beginning in ascending order and even numbers should be at the end in descending order. You don't need to read or write anything from or to the console, just implement the method.

// Hint


// Sample Input:
// 0 1 2 3 4 5

// Sample Output:
// 1 3 5 4 2 0


// Sample Input:
// 5 4 7 2 1 4

// Sample Output:
// 1 5 7 4 4 2



// Memory limit: 256 MB
// Time limit: 8 seconds

// Caution

// You may see errors in your code or execution results due to missing context. Don’t worry about it, just write the solution and press Check.
