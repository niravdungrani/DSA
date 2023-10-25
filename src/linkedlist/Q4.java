//package linkedlist;
//// 4. Get n'th node from singly linked list.
//
//public class Q4 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insert(10);
//        singlyLinkedList.insert(20);
//        singlyLinkedList.insert(30);
//        singlyLinkedList.insert(40);
//        singlyLinkedList.insert(50);
//        singlyLinkedList.print();
//        singlyLinkedList.nThNode(2);
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//    public void insert(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//        }
//    }
//    public void print() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//    public void nThNode(int index) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            int count = 0;
//            Node temp = head;
//            while (temp != null) {
//                count++;
//                if (count == index) {
//                    System.out.print("The " + index + "'th element in the singly linked list is : " + temp.data);
//                    return;
//                }
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
