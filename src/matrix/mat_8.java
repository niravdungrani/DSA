package matrix;

public class mat_8 {
    // Print mirror image of matrix
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<matrix.length;i++){
            for (int j=matrix[0].length-1;j>= 0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
