package array;

public class array_23
{
    // 23. Find 2nd largest element from array

    public static void main(String[] args)
    {
        int [] arr={10,40,70,80,90,20,30};
        int max1;
        int max2;
        if (arr.length<=1){
            System.out.print("not enough element");
            return;
        }
 
        if (arr[0]<arr[1])
        {
            max1=arr[1];
            max2=arr[0];
        }
        else
        {
            max1=arr[0];
            max2=arr[1];
        }
        for (int i=2;i<arr.length;i++)
        {
            if (arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
