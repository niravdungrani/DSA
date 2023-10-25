package matrix;

public class mat_18 {
    // 18. Shortest path to reach from [0,0] to [n,n]
    public static void main(String[] args) {
        int[][] matrix={
                {4,9,16,20},
                {6,1,18,12},
                {7,3,2,15},
                {10,5,11,30}
        };
        int row=matrix.length;
        int col=matrix[0].length;
        for (int r=0;r<row;r++){
            for (int c=0;c<col;c++){
                if (r==0&&c==0){
                    continue;
                } else if (r==0) {
                    matrix[r][c]=matrix[r][c]+matrix[r][c-1];
                } else if (c==0) {
                    matrix[r][c]=matrix[r][c]+matrix[r-1][c];

                }
                else {
                    matrix[r][c]=matrix[r][c]+Math.min(matrix[r-1][c],matrix[r][c-1]);

                }}
        }
        System.out.println(matrix[row-1][col-1]);
    }
}
