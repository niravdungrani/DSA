package matrix;

public class mat_9 {
    // 9. Find highest sum among all rows
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        int max=Integer.MIN_VALUE;
        for (int r=0;r<matrix.length;r++){
            int sum=0;
            for (int c=0;c<matrix[0].length;c++){
                sum=sum+matrix[r][c];
            }
            if (sum>max){
                max=sum;
            }
            System.out.print(max+" ");
        }
        System.out.println("max : "+max);
    }
}
