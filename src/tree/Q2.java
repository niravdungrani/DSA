//package tree;
////Count nodes in binary tree
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}
//
//class BinaryTree {
//    Node root;
//
//    public int countNodes(Node node) {
//        if (node == null) {
//            return 0;
//        } else {
//            int leftCount = countNodes(node.left);
//            int rightCount = countNodes(node.right);
//            return 1 + leftCount + rightCount;
//        }
//
//    }
//
//    public int countNodes() {
//        return countNodes(root);
//    }
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//
//        System.out.println("The number of nodes in the binary tree is: " + tree.countNodes());
//    }
//}
