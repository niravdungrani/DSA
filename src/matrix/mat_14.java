package matrix;

public class mat_14 {
    public static void main(String[] args) {
        int [][] matrix={ {2,4,6},{9,6,3},{7,4,1}};
        for (int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][matrix.length-i-1]);
        }

    }

}
