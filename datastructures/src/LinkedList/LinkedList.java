package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;

        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head =null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node x = head;
        head = head.next;
        x.next = null;
        length--;

        if(length == 0) {
            tail = null;
        }

        return x;
    }

    public Node get(int index) {
        if(index < 0 || index>=length) return null;
        Node temp = head;

        for(int i=0; i<index; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp!= null) {
            temp.value = value;
            return true;
        }
        return false;
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

        Node temp = get(index-1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index<0 || index>= length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;
        for(int i=0; i<length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void partitionList(int x) {
        if(head == null) return;
        if(length == 1) return;

        Node less = null;
        Node lessHead = less;

        Node more = null;
        Node moreHead = more;

        Node temp = head;

        for(int i=0; i<length; i++) {
            if(temp.value < x) {
                if(less == null) {
                    less = temp;
                    lessHead = temp;
                } else {
                    less.next = temp;
                    less = less.next;
                }
            } else {
                if(more == null) {
                    more = temp;
                    moreHead = temp;
                } else {
                    more.next = temp;
                    more = more.next;
                }
            }
            temp = temp.next;
        }
        if(less != null && more !=null) {
            less.next = moreHead;
            more.next = null;
            head = lessHead;
        }
    }

    public Node[] reverse(Node dHead, Node dTail, int index) {
        Node temp = dHead;
        dHead = dTail;
        dTail = temp;

        Node after = temp;
        Node before = null;

        for(int i=0; i<=index; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        return new Node[]{dHead, dTail};
    }

    public void reverseBetween(int m, int n) {
        Node previous = get(m-1);
        Node after = get(n+1);

        Node dHead = get(m);
        Node dTail = get(n);
        Node[] result = reverse(dHead, dTail, n-m);

        previous.next = result[0];
        result[1].next = after;
    }

    public void getHead() {
        System.out.println("Head is " + head.value);
    }

    public void getTail() {
        System.out.println("Tail is " + tail.value);
    }

    public void getLength() {
        System.out.println("Length is " + length);
    }
}
