package matrix;

public class mat_1_2 {
    // 1. Find row and column size from given matrix
    //2. Print a matrix
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6}};
        int row=matrix.length;
        int col=matrix[0].length;
        System.out.println(row +" " + col);
        for (int i=0;i< row;i++){
            for (int j=0;j< col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
