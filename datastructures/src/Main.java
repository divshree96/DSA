//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        LinkedList list = new LinkedList(5);
        list.append(2);
//        list.append(10);
//        list.append(6);
        list.getHead();
        list.getTail();
        list.getLength();
        list.printList();
        System.out.println("Remove last from the list " + list.removeLast().value);
        System.out.println("Remove last from the list " + list.removeLast().value);
        System.out.println("Remove last from the list " + list.removeLast());
    }
}