/*
The algorithm uses two pointers, called 'slow' and 'fast'. Both of these pointers start at the head of the list (the beginning of the chain).

First, 'fast' is moved 'k' steps along the list. If 'fast' encounters the end of the list (represented by 'null') before
it has taken 'k' steps, the function returns 'null' because the list is shorter than 'k' elements.

If 'fast' successfully takes 'k' steps without reaching the end of the list, then the game changes.
Now, both 'slow' and 'fast' start moving along the list at the same pace, one step at a time.

Here's the clever bit: by the time 'fast' hits the end of the list, 'slow' will be 'k' steps behind it - and therefore
 'k' steps from the end of the list. So the function returns 'slow'.

This is a common technique in computer science known as the 'fast-pointer / slow-pointer' or 'runner' technique,
and it's a neat way of finding a position relative to the end of a list in a single pass.
__________________________________________________________________________________________________________________
The method initializes two pointers, slow and fast, both pointing to the head of the LinkedList.

It then moves the fast pointer k steps ahead in the LinkedList. If fast becomes null at any point during this process,
 it means that k is out of bounds (greater than the length of the LinkedList), so the method returns null.

After moving the fast pointer k steps ahead, the method enters a while loop. This loop continues until the fast pointer
reaches the end of the LinkedList (i.e., fast becomes null).

Inside the while loop, both the slow and fast pointers move one step at a time. Since the fast pointer is already k steps
ahead of the slow pointer, when the fast pointer reaches the end of the LinkedList, the slow pointer will be at the kth node from the end.

Finally, the method returns the slow pointer, which now points to the kth node from the end of the LinkedList.
 */
public class FindKthFromEnd {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public FindKthFromEnd(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for(int i=0; i<k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
