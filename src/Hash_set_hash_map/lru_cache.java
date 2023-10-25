package Hash_set_hash_map;


import java.util.HashMap;
// Least recently used.

public class lru_cache {
    public static void main(String[] args) {
        LRU lru = new LRU(4);
        lru.insert(1);
        lru.insert(2);
        lru.insert(3);
        lru.insert(4);
        lru.insert(2);
        lru.insert(5);
        lru.insert(6);
        lru.printLinkedList();
        lru.get(5);
        lru.printLinkedList();
    }
}

class LRU {
    int capacity;
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();
    public LRU(int capacity) {
        this.capacity = capacity;
    }
    public void insert(int value) {
        if (hashMap.containsKey(value)) {
            if (doublyLinkedList.isTail(value)) {
                return;
            }
            doublyLinkedList.remove(hashMap.get(value));
            hashMap.remove(value);
        }
        if (hashMap.size() == capacity) {
            int removedValue = doublyLinkedList.removeFirst();
            hashMap.remove(removedValue);
        }
        Node node = doublyLinkedList.insertLast(value);
        hashMap.put(value, node);
    }
    public void get(int data) {
        if (hashMap.containsKey(data)) {
            if(doublyLinkedList.tail.data == data) {
                return;
            }
            Node address = hashMap.get(data);
            doublyLinkedList.remove(address);
            hashMap.remove(data);
            Node newNode = doublyLinkedList.insertLast(data);
            hashMap.put(data, newNode);
        } else {
            System.out.println("Not Present in th cache!");
        }
    }
    public void printLinkedList() {
        doublyLinkedList.print();
    }
}

class DoublyLinkedList {
    Node head, tail;
    public int removeFirst() {
        int data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return data;
    }
    public Node insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        return newNode;
    }
    public void remove(Node node) {
        if (node.data == head.data) {
            removeFirst();
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
    }
    public boolean isTail(int value) {
        if (tail.data == value) {
            return true;
        }
        return false;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node previous, next;
    public Node(int data) {
        this.data = data;
    }
}