package queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.getFirst();
        q.getLast();
        q.getLength();
        q.printQueue();
        System.out.println("Dequeue 1 : " + q.dequeue().value);
        System.out.println("Dequeue 2 : " + q.dequeue().value);
        System.out.println("Dequeue 3 : " + q.dequeue().value);
        System.out.println("Dequeue 4 : " + q.dequeue());
    }
}
