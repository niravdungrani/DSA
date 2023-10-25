//package tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
////Find an element from Binary tree
//public class Q4 {
//    public static void main(String[] args) {
//
//            BinaryTree tree = new BinaryTree();
//
//            tree.root = new Node(1);
//            tree.root.left = new Node(2);
//            tree.root.right = new Node(3);
//            tree.root.left.left = new Node(4);
//            tree.root.left.left.left = new Node(100);
//            tree.root.left.right = new Node(5);
//            tree.root.right.left=new Node(60);
//            tree.root.right.right=new Node(70);
//            tree.findValue(500);
//
//
//        }
//    }
//class Node{
//    int data;
//    Node left,right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//class BinaryTree {
//    Node root;
//
//    public void findValue(int v) {
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node n = queue.poll();
//            if (n.data == v) {
//                System.out.println("Value Present");
//                return;
//            }
//            if (n.left != null) {
//                queue.add(n.left);
//            }
//            if (n.right != null) {
//                queue.add(n.right);
//            }
//        }
//        System.out.println("Value Not Present");
//    }
//}
