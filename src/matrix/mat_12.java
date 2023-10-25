package matrix;

public class mat_12 {
    // 12. Delete max element from each column
    public static void main(String[] args) {
        int [][] matrix={{8,10,12,6},
                         {0,15,5,8},
                         {9,4,2,20}};
        for (int c=0;c<matrix[0].length;c++){
            int maxindex=0;
            for (int r=0;r<matrix.length;r++){
                if (matrix[r][c]>matrix[maxindex][c]){
                    maxindex=r;
                }
            }
            for (int x=maxindex;x<matrix.length-1;x++){
                matrix[x][c]=matrix[x+1][c];
            }
        }
        for (int i=0;i< matrix.length-1;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}
