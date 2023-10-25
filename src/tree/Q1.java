//package tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Q1 {
//    public static void main(String[] args) {
//        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.root=new Node(10);
//        binaryTree.root.left=new Node(20);
//        binaryTree.root.right=new Node(30);
//        binaryTree.root.left.left=new Node(40);
//        binaryTree.root.left.right=new Node(50);
//        binaryTree.root.right.left=new Node(60);
//        binaryTree.root.right.right=new Node(70);
//        System.out.println("Level Order");
//        binaryTree.levelOrder();
//        System.out.println("Pre Order");
//        binaryTree.preOrder(binaryTree.root);
//        System.out.println("post Order");
//        binaryTree.postOrder(binaryTree.root);
//        System.out.println("In Order");
//        binaryTree.inOrder(binaryTree.root);
//
//    }
//}
//class BinaryTree{
//    Node root;
//
//    public void levelOrder() {
//        Queue<Node>queue=new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()){
//            Node n=queue.poll();
//            System.out.print(n.data+" ");
//            if (n.left!=null){
//                queue.add(n.left);
//            }
//            if (n.right!=null){
//                queue.add(n.right);
//            }
//        }
//    }
//
//    public void preOrder(Node root) {
//        if (root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//    public void postOrder(Node root) {
//        if (root==null){
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+" ");
//    }
//
//    public void inOrder(Node root) {
//        if (root==null){
//            return;
//        }
//        postOrder(root.left);
//        System.out.print(root.data+" ");
//        postOrder(root.right);
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
