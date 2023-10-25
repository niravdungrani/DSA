package matrix;

public class mat_3 {
    // Find element from matrix
    public static void main(String[] args) {
        int [][] matrix={ {1,2,3},{4,5,6},{7,8,9}};
        int n=6;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==n){
                    System.out.println("present at Index : ("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
