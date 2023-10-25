package matrix;

public class mat_16 {
    // 16. Find element from sorted matrix : Binary search: solution log(row) + log(column)
    public static void main(String[] args) {
        int[][] matrix = {
                {2,4,6,9},
                {14,18,19,21},
                {27,28,30,32},
                {34,38,40,45},
                {47,50,52,55}};
        int v=30;
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0, bottom=row-1;
        int rowTobeSerched=-1;
        while (top<=bottom){
            int mid=(top+bottom)/2;
            if (matrix[mid][0]<=v&&matrix[mid][col-1]>=v){
                rowTobeSerched=mid;
                break;
            } else if (v>matrix[mid][col-1]) {
                top=mid+1;
            } else if (v<matrix[mid][0]) {
                bottom=mid-1;
            }
        }
        if (rowTobeSerched==-1){
            System.out.println("Not present");
            return;
        }
        int left=0,right=col-1;
        while(left<=right){
            int mid=(left+right)/2;
            if (v==matrix[rowTobeSerched][mid]){
                System.out.println("present");
                return;
            } else if (v<matrix[rowTobeSerched][mid]) {
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        System.out.println("Not Present");


    }
}
