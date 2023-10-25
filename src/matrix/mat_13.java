package matrix;

public class mat_13 {
    // Print diagonal elements of matrix (both)
    public static void main(String[] args) {
        int [][] matrix={ {2,4,6},{9,6,3},{7,4,1}};
        for (int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][i]);
        }
    }

}
