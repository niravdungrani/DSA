package matrix;

public class mat_4 {
    // Sum of elements of matrix
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6}};
        int sum=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }

}
