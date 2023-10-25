package Hash_set_hash_map;
//2. Check if pair with given Sum exists in Array

import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int sum=90;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int num : arr) {
            int complement = sum - num;
            if (hashSet.contains(complement)) {
                System.out.println("pair is : "+complement+","+num);
                return;
            }
            hashSet.add(num);
        }
        System.out.println("pair is not present");
    }
}
