//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        FindKthFromEnd list = new FindKthFromEnd(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println(list.findKthFromEnd(2).value);
        System.out.println(list.findKthFromEnd(5).value);
        System.out.println(list.findKthFromEnd(6));

        System.out.println(list.myApproach(2).value);
        System.out.println(list.myApproach(5).value);
        System.out.println(list.myApproach(6));
//        LinkedList list = new LinkedList(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.printList();
//        list.reverse();
//        list.printList();
//        System.out.println("Get 0 : " + list.get(0).value);
//        System.out.println("Get 1 : " + list.get(1).value);
//        System.out.println("Get 2 : " + list.get(2).value);
//        System.out.println("Get null : " + list.get(3));
//        System.out.println(STR."Removed \{list.removeFirst().value}");
//        list.printList();
//        System.out.println(STR."Removed \{list.removeFirst().value}");
//        list.printList();
//        System.out.println(STR."Removed \{list.removeFirst()}");
//        list.printList();
//        list.prepend(3);
//        list.append(10);
//        list.append(6);
//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.printList();
//        System.out.println("Remove last from the list " + list.removeLast().value);
//        System.out.println("Remove last from the list " + list.removeLast().value);
//        System.out.println("Remove last from the list " + list.removeLast());
    }
}