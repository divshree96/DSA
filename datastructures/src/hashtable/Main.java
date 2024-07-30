package hashtable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);
        ht.set("paint", 20);
        ht.set("bolts", 200);
        ht.set("screws", 140);

        System.out.println(ht.keys());
//        System.out.println(ht.get("screws")); //140
//        System.out.println(ht.get("lumber")); //80
//        System.out.println(ht.get("rubber")); //0
        ht.printTable();
        System.out.println(itemInCommon(new int[]{1, 3, 5}, new int[]{2, 4, 5}));
    }

    public static boolean itemInCommon(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int i : arr1) {
            hashMap.put(i, true);
        }

        for(int j : arr2) {
            if(hashMap.get(j) != null) return true;
        }

        return false;
    }
}
