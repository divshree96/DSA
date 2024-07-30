package hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);

        ht.set("bolts", 200);
        ht.set("screws", 140);

        System.out.println(ht.get("screws")); //140
        System.out.println(ht.get("lumber")); //80
        System.out.println(ht.get("rubber")); //0
        //ht.printTable();
    }
}
