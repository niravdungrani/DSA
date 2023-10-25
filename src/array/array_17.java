package array;

public class array_17 {
    // 17. Insert / update / search / print / delete
    public static void main(String[] args){
        int[] arr= new int[5];
        int p=0;
        System.out.println( "is Empty :"+isEmpty( p));
        p=insert(arr,10,p);
        p=insert(arr,20,p);
        p=insert(arr,30,p);
        p=insert(arr,40,p);
        p=insert(arr,50,p);
        System.out.println("Size :"+size(p));
        p=insert(arr,60,p);
        print(arr,p);
        System.out.println(find(arr,30,p));
        update(arr,20,p,70);
        System.out.println("after update");
        print(arr,p);
        System.out.println("Size :"+ size(p));
        p=delete(arr,70,p);
        System.out.println("after delete");
        print(arr,p);
    }
    private static int delete(int[] arr, int v, int p) {
        for(int i=0; i<p; i++)
        {
            if (arr[i]==v){
                for (int j=i; j<p-1; j++){
                    arr[j]=arr[j+1];
                 }
                p--;
                return p;
            }
        }
        return p;
    }
    private static int size(int p)
    {
        return p;
    }
    private static boolean isEmpty(int p) {
        if(p==0){
            return true;
        }
        return false;
    }
    private static void update(int[] arr, int oldv, int p, int newv) {
        for (int i=0; i<p; i++){
            if(arr[i]==oldv) {
                arr[i] = newv;
            }
            }
        }
    private static boolean find(int[] arr, int v, int p) {
        for (int i=0;i<p;i++){
            if(arr[i]==v){
                return true;
            }
        } return false;
    }
    private static void print(int[] arr, int p) {
        for (int i=0; i<p; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    private static int insert(int[] arr, int v, int p) {
        if(p==arr.length){
            System.out.println("array is full");
            return p;
        }
        arr[p]=v;
        p++;
        return p;
    }
}
