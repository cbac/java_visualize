import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
   public static void main(String[] args) {
      Stack<String> stack = new Stack<String>();
      Queue<String> queue = new ArrayDeque<String>();

      stack.push("stack-first");
      stack.push("stack-last");

      queue.add("queue-first");
      queue.add("queue-last");

      for (String s : stack) 
         System.out.println("stack contains " + s);
      for (String s : queue)
         System.out.println("queue contains " + s);

      while (!stack.isEmpty())
         System.out.println(stack.pop());
      while (!queue.isEmpty())
         System.out.println(queue.remove());
   }
}