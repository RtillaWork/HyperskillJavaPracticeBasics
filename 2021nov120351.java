// Check if Prime
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.*;

class PrimeNumbers {

    /**
     * Checking if a number is prime
     *
     * @param number to test >= 2
     * @return true if number is prime else false
     */
    private static boolean isPrime(long number) {
        // write your code here
        Predicate<Long> isADivisor = denom -> number % denom == 0;
        List<Long> numberDivisors = Stream.iterate(Long.valueOf(1), d -> d + 1)
                .limit(number)
                .filter(isADivisor)
                .collect(Collectors.toList());
        return numberDivisors.size() == 2; // only divisor is 1 and number itself. Could do a bit better by tweaking the seed, the limit() and size() to 0
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        int n = Integer.parseInt(line);

        System.out.println(isPrime(n) ? "True" : "False");
    }
}

// OR

// import java.util.Scanner;
// import java.util.stream.*;

// class PrimeNumbers {

//     /**
//      * Checking if a number is prime
//      *
//      * @param number to test >= 2
//      * @return true if number is prime else false
//      */
//     private static boolean isPrime(long number) {
//         return LongStream.rangeClosed(2, (int) Math.sqrt(number))
//                 .noneMatch(i -> number % i == 0);

//     }

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         String line = scanner.nextLine().trim();

//         int n = Integer.parseInt(line);

//         System.out.println(isPrime(n) ? "True" : "False");
//     }
// }

