package matrix;

public class mat_7 {
    // Print matrix in spiral form or zigzag
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9},{0,1,2}};

        for (int i=0;i<matrix.length;i++){
            if (i%2==0){
                for (int j=0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else {
                for (int j=matrix[0].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

}
