package stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.getTop();
        s.getHeight();
        s.printStack();
        System.out.println("Popped Item : " + s.pop().value);
        s.printStack();
    }
}
