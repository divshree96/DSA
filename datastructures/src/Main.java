//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
//        dll.append(3);
//        dll.append(4);
//        dll.append(5);
//        dll.append(1);
        dll.printList();
        System.out.println("-----------------");
//        System.out.println("Palindrome : " + dll.isPalindrome());
        dll.swapPairs();
        dll.printList();


//        System.out.println("Remove Last node : " + dll.removeLast().value);
//        dll.printList();
//
//        dll.prepend(10);
//        dll.printList();
//        System.out.println("Remove first Node : " + dll.removeFirst().value);
//        dll.printList();
//        dll.getHead();
//        dll.getTail();
//        dll.getLength();


//        LinkedList myLinkedList = new LinkedList(10);
//        myLinkedList.append(21);
//        myLinkedList.append(13);
//        myLinkedList.append(8);
//        myLinkedList.append(9);
//        myLinkedList.append(7);
//        myLinkedList.printList();
//        System.out.println("____________________________________");
//        //myLinkedList.reverseBetween(1, 3);
//        myLinkedList.partitionList(5);
//        myLinkedList.printList();

//        LLRemoveDuplicates myLinkedList = new LLRemoveDuplicates(1);
//
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//
//        myLinkedList.removeDuplicates();
//
//        myLinkedList.printList();

//        LLHasLoop list = new LLHasLoop(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.append(5);
//
//        // create a loop by connecting the tail to the second node
//        list.getTail().next = list.getHead().next;
//        System.out.println(list.hasLoop());

//        FindKthFromEnd list = new FindKthFromEnd(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.append(5);
//
//        System.out.println(list.findKthFromEnd(2).value);
//        System.out.println(list.findKthFromEnd(5).value);
//        System.out.println(list.findKthFromEnd(6));
//
//        System.out.println(list.myApproach(2).value);
//        System.out.println(list.myApproach(5).value);
//        System.out.println(list.myApproach(6));

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