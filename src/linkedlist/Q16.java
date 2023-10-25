//package linkedlist;
//// 16. Create, insert, print, delete, update, search doubly linked list.
//
//public class Q16 {
//    public static void main(String[] args) {
//        LinkedList doublyLinkedList = new LinkedList();
//        doublyLinkedList.insertLast(10);
//        doublyLinkedList.insertLast(20);
//        doublyLinkedList.insertLast(30);
//        doublyLinkedList.print();
//        doublyLinkedList.update(20, 200);
//        doublyLinkedList.print();
//        doublyLinkedList.insertLast(40);
//        doublyLinkedList.insertLast(50);
//        doublyLinkedList.print();
//        doublyLinkedList.search(400);
//        doublyLinkedList.deleteSpecific(30);
//        doublyLinkedList.print();
//    }
//}
//class LinkedList {
//    Node head;
//    Node tail;
//    public void insertLast(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            tail.next = newNode;
//            newNode.previous = tail;
//            tail = newNode;
//        }
//    }
//    public void print() {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
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
//    public void update(int oldValue, int newValue) {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                if (temp.data == oldValue) {
//                    temp.data = newValue;
//                    return;
//                }
//                temp = temp.next;
//            }
//        }
//    }
//    public void search(int value) {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                if (temp.data == value) {
//                    System.out.println("The value you want to search in the doubly linked list is found!");
//                    return;
//                }
//                temp = temp.next;
//            }
//            System.out.println("The value you want to search in the doubly linked list is not found!");
//        }
//    }
//    public void deleteSpecific(int value) {
//        if (head == null) {
//            System.out.println("The doubly linked list is empty!");
//            return;
//        } else if (head == tail && head.data == value) {
//            head = null;
//            tail = null;
//        } else if (head.data == value) {
//            Node temp = head;
//            head = head.next;
//            head.previous = null;
//            temp.next = null;
//        } else {
//            Node currentNode = head.next;
//            Node previousNode = head;
//            while (currentNode != null && currentNode.data != value) {
//                previousNode = currentNode;
//                currentNode = currentNode.next;
//            }
//            if (currentNode == tail) {
//                tail = previousNode;
//                tail.next = null;
//            } else {
//                if (currentNode != null && currentNode.data == value) {
//                    previousNode.next = currentNode.next;
//                    currentNode.next.previous = previousNode.next;
//                    currentNode = null;
//                } else {
//                    System.out.println("The node you want to delete is not exist in the singly linked list!");
//                }
//            }
//        }
//    }
//}
//class Node {
//    int data;
//    Node previous;
//    Node next;
//    Node (int data) {
//        this.data = data;
//        this.previous = null;
//        this.next = null;
//    }
//}