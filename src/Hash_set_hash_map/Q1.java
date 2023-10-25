package Hash_set_hash_map;

import java.util.HashSet;

// 1. Find whether an array is subset of another array
public class Q1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,7};
        HashSet<Integer> hashSet=new HashSet<>();
        for (int a:arr1) {
            hashSet.add(a);
        }
        for (int a:arr2) {
            if (!hashSet.contains(a)){
                System.out.println("not subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
