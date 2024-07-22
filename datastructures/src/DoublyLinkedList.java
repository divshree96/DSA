public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node n = new Node(value);
        if(length == 0) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node n = new Node(value);
        if(length == 0) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
         Node temp = head;
         if(length == 1) {
             head = null;
             tail = null;
         } else {
             head = head.next;
             head.prev = null;
             temp.next = null;
         }
         length--;
         return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp;

        if(index < length/2) {
            temp = head;
            for(int i = 0; i<index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length-1; i>index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp == null) return false;
        temp.value = value;
        return true;
    }
}
