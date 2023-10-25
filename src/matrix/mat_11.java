package matrix;

public class mat_11 {
    // 11. Delete max element from each row
    public static void main(String[] args) {
        int [][] matrix={{8,10,2,6},
                         {0,5,15,8},
                         {9,4,2,20}};
        for (int r=0;r<matrix.length;r++){
            int maxindex=0;
            for (int c=1;c<matrix[0].length;c++)
            {
                if (matrix[r][c]>matrix[r][maxindex]){
                    maxindex=c;
                }
            }
            for (int x=maxindex;x<matrix[0].length-1;x++){
                matrix[r][x]=matrix[r][x+1];
            }
        }
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
