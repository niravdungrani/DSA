package matrix;

public class mat_6 {
    // 6. Column wise traversal

    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6}};
        for (int c=0;c<matrix[0].length;c++){
            for (int r=0;r<matrix.length;r++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }

    }
}
