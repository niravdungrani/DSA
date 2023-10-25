package Hash_set_hash_map;

import java.util.HashMap;
import java.util.Map;

// 4. Most frequent element in an array
public class Q4 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,2,1,3,5,6,9,2,5,7,3,1,2};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else {
                int count=hashMap.get(arr[i]);
                hashMap.put(arr[i],count+1);
            }
        }
        int mostFrequentElement=Integer.MIN_VALUE;
        int maxFrequency=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer>mapEntry : hashMap.entrySet()){
            int frequency = mapEntry.getValue();
            if (frequency>maxFrequency){
                maxFrequency=frequency;
                mostFrequentElement=mapEntry.getKey();
            }
        }
        System.out.println("Most frequent element is : "+mostFrequentElement);

    }
}
