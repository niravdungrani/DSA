package array;

public class array_3 {
    // Count odd / even element in array
    public static void main (String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6,7};
        int n = arr.length;
        int Even = 0, Odd = 0;


        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0)
                Even++;

            else
                Odd++;
        }
        System.out.println("Even count : "+ Even);
        System.out.println("Odd count : "+ Odd);
    }
}
