package tree;

import java.util.Deque;
import java.util.LinkedList;

// print Spiral
public class Q6 {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(10);
        binaryTree.root.left=new Node(20);
        binaryTree.root.right=new Node(30);
        binaryTree.root.left.left=new Node(40);
        binaryTree.root.left.right=new Node(50);
        binaryTree.root.right.left=new Node(60);  
        binaryTree.root.right.right=new Node(70);
        binaryTree.root.left.left.right=new Node(80);
        binaryTree.root.left.right.left=new Node(90);
        binaryTree.root.right.left.right=new Node(100);
        binaryTree.root.right.right.right=new Node(110);
        binaryTree.printSpiral();
    }
}
class BinaryTree{
    Node root;


    public void printSpiral() {
        Deque <Node> deque=new LinkedList<>();
        deque.add(root);
        boolean flag=true;
        while (!deque.isEmpty()){
            int size=deque.size();
            if (flag){
                while (size>0){
                    Node node=deque.removeFirst();
                    System.out.print(node.data+" ");
                    if (node.left!=null){
                        deque.addLast(node.left);
                    }
                    if (node.right!=null){
                        deque.addLast(node.right);
                    }
                    size--;
                }
                System.out.println();
                flag=!flag;
            }
            else {
                while (size>0){
                    Node node=deque.removeLast();
                    System.out.print(node.data+" ");
                    if (node.right!=null){
                        deque.addFirst(node.right);
                    }
                    if (node.left!=null){
                        deque.addFirst(node.left);
                    }
                    size--;
                }
                System.out.println();
                flag=!flag;
            }
        }
    }
}
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}
