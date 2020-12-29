import java.util.*;

public class Main {
    public static class QueueViaStacks {
        private Stack<Integer> aux = new Stack<Integer>();
        private Stack<Integer> queue = new Stack<Integer>();

        public void add(int value) {
            if(queue.isEmpty()) {
                queue.push(value);
            } else {
                while (!queue.isEmpty()) {
                    aux.push(queue.pop());
                }
                queue.push(value);
                while(!aux.isEmpty()) {
                    queue.push(aux.pop());
                }
            }
        }

        public int peek() {
            return queue.peek();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int remove() {
            return queue.pop();
        }


    }
    public static void main(String[] args) {
        QueueViaStacks q = new QueueViaStacks();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
    }

}
