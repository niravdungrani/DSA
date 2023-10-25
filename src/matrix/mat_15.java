package matrix;

public class mat_15 {
    // 15. Sum of all diagonal elements in matrix (same position not allowed twice)
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum=sum+matrix[i][i];
            if (i!=matrix.length-i-1){
                sum=sum+matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }
}