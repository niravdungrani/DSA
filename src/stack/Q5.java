package stack;

import java.util.Stack;

public class Q5 {
   //  5. Delete middle element of a stack

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Original Stack: " + st);
        int length = st.size();
        Stack<Integer> temp=new Stack<Integer>();

        int middle = length / 2;
        for (int i = 0; i < middle; i++) {
            temp.push(st.pop());
        }
        st.pop();
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println("Stack after deleting middle element: "+st);
    }
}
