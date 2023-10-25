//package tree;
////Find n-th node of inorder traversal
//public class Q3 {
//
//    public static void main(String[] args) {
//        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.root=new Node(10);
//        binaryTree.root.left=new Node(20);
//        binaryTree.root.right=new Node(30);
//        binaryTree.root.left.left=new Node(40);
//        binaryTree.root.left.right=new Node(50);
//        binaryTree.root.right.left=new Node(60);
//        binaryTree.root.right.right=new Node(70);
//        binaryTree.nthNodeInOrder(binaryTree.root,3);
//
//    }
//}
//class BinaryTree{
//    private static int c=0;
//    Node root;
//    public void nthNodeInOrder(Node root,int n) {
//        if (root==null){
//            return;
//        }
//        nthNodeInOrder(root.left,n);
//        c++;
//        if (c==n) {
//            System.out.println(root.data);
//            return;
//        }
//        nthNodeInOrder(root.right,n);
//
//    }
//}
//class Node{
//    int data;
//    Node left,right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}