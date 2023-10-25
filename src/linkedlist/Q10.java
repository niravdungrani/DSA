//package linkedlist;
//// 10. Remove duplicates from a sorted linked list
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//
//    public void insert(int data) {
//        Node nn = new Node(data);
//        if (head == null) {
//            head = nn;
//            tail = nn;
//        } else {
//            tail.next = nn;
//            tail = nn;
//        }
//    }
//
//    public void print() {
//        if (head == null) {
//            System.out.println("empty");
//            return;
//        }
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//    }
//
//    public void dublicate() { // dublicate element
//        if (head == null) {
//            System.out.println("emptu linkedlist");
//            return;
//        }
//        Node temp = head, prev = head;
//        while (temp != null) {
//            if (temp.data != prev.data) {
//                prev.next = temp;
//                prev = temp;
//            }
//            temp = temp.next;
//        }
//        if (prev != temp) {
//            prev.next = null;
//        }
//    }
//}
//
//
//
//public class Q10 {
//    public static void main(String[] args) {
//        LinkedList linkedList=new LinkedList();
//        linkedList.insert(10);
//        linkedList.insert(20);
//        linkedList.insert(20);
//        linkedList.insert(30);
//        linkedList.insert(40);
//        linkedList.insert(40);
//        linkedList.insert(50);
//        linkedList.print();
//        linkedList.dublicate();
//        System.out.println("after duplicate delete  :");
//        linkedList.print();
//    }
//}
