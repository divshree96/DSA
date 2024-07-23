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

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >=length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();

        Node temp = get(index);
        //readable
//        Node before = temp.prev;
//        Node after = temp.next;
//
//        temp.prev = null;
//        temp.next = null;
//
//        before.next = after;
//        after.prev = before;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while(current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean isPalindrome() {
        if(length == 0 || length == 1) return true;

        Node temp = head;
        Node temp1 = tail;

        for(int i=0; i<length/2; i++) {
            System.out.println("Comparing : " + temp.value + " and " + temp1.value);
            if(temp.value == temp1.value) {
                temp = temp.next;
                temp1 = temp1.prev;
            } else {
                return false;
            }
        }
        return true;
    }

    public void swapPairs() {
        if(length<=1) return;

        Node temp = head;
        head = head.next;
        for(int i=0; i<length/2; i++) {
            Node x = temp.next.next;
            temp.next.next = temp;
            temp.next.prev = temp.prev;
            temp.prev = temp.next;
            temp.next = x;

            if(x !=null) {
                x.prev = temp;
                temp = x;
            } else {
                temp.prev.prev.next = temp.prev;
            }
        }
        tail = temp;
    }
}
