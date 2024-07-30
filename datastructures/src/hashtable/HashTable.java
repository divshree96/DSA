package hashtable;

public class HashTable {
    private int size = 7;
    private Node[] datamap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        datamap = new Node[size];
    }

    public void printTable() {
        for(int i=0; i < datamap.length; i++) {
            System.out.println(i + " : ");
            Node temp = datamap[i];
            while(temp != null) {
                System.out.println("    { " + temp.key + " = " + temp.value + " }");
                temp = temp.next;
            }
        }
    }
}
