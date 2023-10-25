package matrix;

public class mat_5 {
    //  Print matrix in reverse
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        for (int i=matrix.length-1;i>= 0;i--){
            for (int j=matrix[0].length-1;j>= 0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
