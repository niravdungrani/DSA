package Hash_set_hash_map;

import java.util.HashMap;
import java.util.Map;

// 5. Check if two arrays are equal or not
public class Q5 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,4,6,5};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <arr1.length ; i++) {
            if (!hashMap.containsKey(arr1[i])){
                hashMap.put(arr1[i],1 );
            }else{
                int count=hashMap.get(arr1[i]);
                hashMap.put(arr1[i],count+1 );
            }
        }
        for (int i = 0; i <arr2.length ; i++) {
            if (!hashMap.containsKey(arr2[i])){
                hashMap.put(arr2[i],1 );
            }else{
                int count=hashMap.get(arr2[i]);
                hashMap.put(arr2[i],count+1 );
            }
        }
        System.out.println(hashMap);



        for (Map.Entry<Integer,Integer>mapEntry : hashMap.entrySet()){
                if (mapEntry.getValue()!=2){
                    System.out.println("Arrays are not equal");
                    return;

                }
            }

        System.out.println("arrays are equal");
    }
}
