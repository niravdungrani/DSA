package Queue;

public class Q1 {
    public static void main(String[] args) {
         int [] queue=new int[5];
         int f=-1,r=-1;
          r=enQueue(queue,r,10);
        r=enQueue(queue,r,20);
        r=enQueue(queue,r,30);
        r=enQueue(queue,r,40);
        r=enQueue(queue,r,50);
        r=enQueue(queue,r,60);
        System.out.println("peek is : "+peek(queue,f));

        print(queue,r,f);
        f=deQueue(queue,f,r);
        System.out.println("after delete");
        print(queue,r,f);
        System.out.println("peek is : "+peek(queue,f));

    }

    private static int peek(int[] queue, int f) {
        return queue[f+1];
    }

    private static int deQueue(int[] queue, int f, int r) {
        if (f==r){
            System.out.println("Queue is empty");
            return f;
        }
        f++;
        System.out.println(queue[f]+"is removed");
        if (f==r){
            f=r=-1;
        }
        return f;
    }

    private static void print(int[] queue, int r, int f) {
        for (int i = f+1; i <=r ; i++) {
            System.out.print(queue[i]+" ");
        }
    }

    private static int enQueue(int[] queue, int r, int value) {
        if (r==queue.length-1){
            System.out.println("Queue is full");
            return r;
        }
        r++;
        queue[r]=value;     
        return r;
    }
}
