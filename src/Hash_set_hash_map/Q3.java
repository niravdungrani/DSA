package Hash_set_hash_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// 3. Count frequency of each number in array
public class Q3 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,2,1,3,5,6,9,2,5,7,3,1,2};
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], 1);
            }else {
                int oldV=hashMap.get(arr[i]);
                hashMap.put(arr[i], oldV+1);
            }
        }
        for (Map.Entry me:hashMap.entrySet()) {
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
