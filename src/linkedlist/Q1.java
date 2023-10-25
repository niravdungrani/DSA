//package linkedlist;
//
// // 1. Create, insert, print, delete, update, search in singly linked list.
//
//public class Q1 {
//    public static void main(String[] args) {
//        LinkedList singlyLinkedList = new LinkedList();
//        singlyLinkedList.insertLast(10);
//        singlyLinkedList.insertLast(20);
//        singlyLinkedList.insertLast(30);
//        singlyLinkedList.print();
//        singlyLinkedList.deleteSpecific(30);
//        singlyLinkedList.print();
//        singlyLinkedList.insertLast(40);
//        singlyLinkedList.insertLast(50);
//        singlyLinkedList.insertLast(60);
//        singlyLinkedList.print();
//        singlyLinkedList.search(20);
//        System.out.println("Size is : "+singlyLinkedList.size());
//        singlyLinkedList.update(40, 400);
//        singlyLinkedList.print();
//        singlyLinkedList.headElement();
//        singlyLinkedList.tailElement();
//        singlyLinkedList.insertFirst(70);
//        singlyLinkedList.print();
//        singlyLinkedList.insertSpecific(3, 80);
//        singlyLinkedList.print();
//        singlyLinkedList.deleteFirst();
//        singlyLinkedList.print();
//        singlyLinkedList.deleteLast();
//        singlyLinkedList.print();
//        singlyLinkedList.reverse();
//        singlyLinkedList.print();
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
//            tail = newNode;
//        }
//    }
//    public void insertFirst(int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            newNode.next = head;
//            head = newNode;
//        }
//    }
//    public void insertSpecific(int index, int value) {
//        Node newNode = new Node(value);
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//        } else {
//            Node temp = head;
//            int i = 0;
//            while (i < index - 1) {
//                temp = temp.next;
//                i++;
//            }
//            newNode.next = temp.next;
//            temp.next = newNode;
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
//    public void deleteFirst() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else if (head == tail) {
//            head = null;
//            tail = null;
//        } else {
//            head = head.next;
//        }
//    }
//    public void deleteLast() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else if (head == tail) {
//            head = null;
//            tail = null;
//        } else {
//            Node previous = head;
//            for (int i = 0; i < size() - 2; i++) {
//                previous = previous.next;
//            }
//            previous.next = null;
//            tail = previous;
//        }
//    }
//    public void deleteSpecific(int value) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else if (head == tail && head.data == value) {
//            head = null;
//            tail = null;
//        } else if (head.data == value) {
//            Node temp = head;
//            head = head.next;
//            temp.next = null;
//        } else {
//            Node current = head.next;
//            Node previous = head;
//            while (current != null && current.data != value) {
//                previous = current;
//                current = current.next;
//            }
//            if (current == tail) {
//                tail = previous;
//            }
//            if (current != null && current.data == value) {
//                previous.next = current.next;
//                current.next = null;
//            }
//        }
//    }
//    public void search(int value) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            int i = 0;
//            Node temp = head;
//            while (temp != null) {
//                if (temp.data == value) {
//                    System.out.println("The element you entered is found " + i + "'th position in the singly linked list!");
//                    return;
//                }
//                temp = temp.next;
//                i++;
//            }
//            System.out.println("The element you entered is not found in the singly linked list!");
//        }
//    }
//    public int size() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return -1;
//        } else {
//            int count = 0;
//            Node temp = head;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
//    }
//    public void update(int oldValue, int newValue) {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
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
//        System.out.println("The element you entered for updation is not found in the singly linked list!");
//    }
//    public void headElement() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            System.out.println("The head element of singly linked list is : " + head.data);
//        }
//    }
//    public void tailElement() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else {
//            System.out.println("The tail element of singly linked list is : " + tail.data);
//        }
//    }
//
//    public void reverse() {
//        if (head == null) {
//            System.out.println("The singly linked list is empty!");
//            return;
//        } else if (head == tail) {
//            return;
//        } else {
//            Node previous = null;
//            Node current = head;
//            Node tail = head;
//            Node next;
//            while (current != null) {
//                next = current.next;
//                current.next = previous;
//                previous = current;
//                current = next;
//            }
//            head = previous;
//        }
//    }
//}
//class Node {
//    int data;
//    Node next;
//    Node (int data) {
//        this.data = data;
//        this.next = null;
//    }
//}