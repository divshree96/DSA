package hashtable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashTable ht = new HashTable();
//        ht.set("nails", 100);
//        ht.set("tile", 50);
//        ht.set("lumber", 80);
//        ht.set("paint", 20);
//        ht.set("bolts", 200);
//        ht.set("screws", 140);
//
//        System.out.println(ht.keys());
////        System.out.println(ht.get("screws")); //140
////        System.out.println(ht.get("lumber")); //80
////        System.out.println(ht.get("rubber")); //0
//        ht.printTable();
//        System.out.println(itemInCommon(new int[]{1, 3, 5}, new int[]{2, 4, 5}));

//        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
//        List<Integer> duplicates = findDuplicates(nums);
//        System.out.println(duplicates);

//        System.out.println(firstNonRepeatingChar("leetcode"));
//        System.out.println(firstNonRepeatingChar("hello"));
//        System.out.println(firstNonRepeatingChar("aabbcc"));

        //System.out.println(key("leetcode"));
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
//        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
//        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
//        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

//        int[] nums1 = {1, 2, 3, 4, 5};
//        int target1 = 9;
//        int[] result1 = subarraySum(nums1, target1);
//        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
//
//        int[] nums2 = {-1, 2, 3, -4, 5};
//        int target2 = 0;
//        int[] result2 = subarraySum(nums2, target2);
//        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
//
//        int[] nums3 = {2, 3, 4, 5, 6};
//        int target3 = 3;
//        int[] result3 = subarraySum(nums3, target3);
//        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
//
//        int[] nums4 = {};
//        int target4 = 0;
//        int[] result4 = subarraySum(nums4, target4);
//        System.out.println("[]" + result4.length) ;

//        System.out.println(hasUniqueChars("abcdefg")); // should return true
//        System.out.println(hasUniqueChars("hello")); // should return false
//        System.out.println(hasUniqueChars("")); // should return true
//        System.out.println(hasUniqueChars("0123456789")); // should return true
//        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet<>();
        List<int[]> res = new ArrayList<>();
        for(int i : arr1) {
            set.add(i);
        }
        int last = Integer.MIN_VALUE;
        System.out.println("Last is " + last);
        for(int j : arr2) {
            if(set.contains(target-j)) {
                res.add(new int[]{target-j, j});
            }
        }
        return res;
    }

    public static boolean hasUniqueChars(String string) {
        if(string == null || string == "") return true;
        Set<Character> str = new HashSet<>();
        for(int i=0; i<string.length(); i++) {
            if(!str.add(string.charAt(i))) return false;
        }
        return true;
    }

    public static int[] subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;
        for(int i=0; i< nums.length; i++) {
            currentSum += nums[i];
            if(sumIndex.containsKey(currentSum-target)) {
                return new int[]{sumIndex.get(currentSum-target)+1, i};
            }
            sumIndex.put(currentSum, i);
        }
        return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                return new int[]{hm.get(target - nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }

    public static String firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(map.get(ch) == 1) return String.valueOf(ch);
        }
        return null;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> ht = new HashSet<>();

        for(int i : nums) {
            if(!ht.add(i)){
                list.add(i);
            }
        }
        return list;
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
