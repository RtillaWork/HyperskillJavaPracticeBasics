import java.util.*;

public class Main {

    public static void main(String[] args) {        
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));

        // write your code here
//        queue.offer(5);
//        queue.poll();
//        queue.poll();
        System.out.println(queue);


        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sPop = states.pop();
        String sPeek = states.peek();
        String sPeekLast = states.peekLast();
        states.offer(sPop);
        String sPollLast = states.pollLast();

        while (states.peek() != null) {
            System.out.print(states.pop());
        }

        System.out.println(states);
    }
}
