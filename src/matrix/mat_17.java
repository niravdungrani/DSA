package matrix;

public class mat_17 {
    //17. Search in a row wise and column wise sorted matrix (approach: Right top pointer)
    public static void main(String[] args) {
        int[][] matrix={
                {4,9,16,20},
                {6,10,18,21},
                {7,13,20,25},
                {10,15,24,30}
        };
        int v=13;
        int r=0,c=matrix[0].length-1;
        while(c>=0&&r<=matrix.length-1){
            if (matrix[r][c]==v){
                System.out.println("present");
                return;
            } else if (v>matrix[r][c]) {
                r++;
            }
            else {
                c--;
            }
        }
        System.out.println("Not present");


    }
}
