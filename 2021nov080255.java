
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int numberOfTasks = sc.nextInt();
        sc.nextLine(); // to clear buffer

        Queue<Integer> q1 = new ArrayDeque<>();
        int q1Load = 0;
        Queue<Integer> q2 = new ArrayDeque<>();
        int q2Load = 0;

        for (int i = 0; i < numberOfTasks; i++) {
            int task = sc.nextInt();
            int load = sc.nextInt();
            sc.nextLine(); // to clear buffer

            if (q1Load == q2Load) {
                q1.offer(task);
                q1Load += load;
                continue;
            } else if (q1Load < q2Load) {
                q1.offer(task);
                q1Load += load;
                continue;
            } else {
                q2.offer(task);
                q2Load += load;
                continue;
            }
        }

        q1.forEach(elem -> System.out.printf("%d ", elem));
        System.out.println();
        q2.forEach(elem -> System.out.printf("%d ", elem));

    }
}

// Greedy load balance
// Write a program that implements a simple load balancer.

// The program must read tasks from the standard input and distribute them between two queues. Tasks will be processed by a system (in the future). Each task has a unique identifier and a number indicating the load on the system (in parrots).

// The balancer should distribute tasks between queues by the following rule: the task is added to the lower-load queue (by the total load). If both queues have the same total load indicator, the task must be added to the first queue.

// It's guaranteed, the input data contain at least two tasks.

// Input data format

// The first line contains the number of tasks. Other lines consist of task description: an identifier and a load indicator (separated by a space).

// Output data form

// The first line should contain identifiers of tasks in the first queue, the second line should contain the identifiers in the second queue.


// Sample Input:
// 6
// 1 1
// 2 1
// 3 1
// 4 3
// 5 1
// 6 1

// Sample Output:
// 1 3 5 6
// 2 4



// Memory limit: 256 MB
// Time limit: 8 seconds
