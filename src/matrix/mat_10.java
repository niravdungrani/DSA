package matrix;

public class mat_10 {
    // 10. Find highest sum among all columns

    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        int max=Integer.MIN_VALUE;
        for (int c=0;c<matrix[0].length;c++){
            int sum=0;
            for (int r=0;r<matrix.length;r++){
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
