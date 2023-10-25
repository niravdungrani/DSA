package array;

public class array_1{
    // Sum of array element
    public static void main(String[] args){
        int marks[] = {88,85,78,91,79,64};
        int sum=0;

        for(int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
