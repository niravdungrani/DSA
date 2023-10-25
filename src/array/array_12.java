package array;

public class array_12
{
    // 12. Find common elements between two arrays
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 3, 4, 9, 11, 7, 18, 20};


        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {

                    System.out.print(arr1[i] +" ");
                }
            }
        }
    }
}
