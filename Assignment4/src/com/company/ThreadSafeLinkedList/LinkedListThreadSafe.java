package com.company.ThreadSafeLinkedList;

public class LinkedListThreadSafe {
    public Node head;
    int size;
    Object lock;

    public LinkedListThreadSafe() {
        this.head = null;
        this.size = 0;
        this.lock = new Object();
    }

    public void addAtPosition(int index, int element) {
        synchronized (lock) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Linked List out of bounds");
            }
            if (head == null && index == 0) { // Add at index 0 when LL is empty
                head = new Node(element);
                size++;
                return;
            }
            Node current = head;
            if (head != null && index == 0) { // Add at index 0 when first element is already available in LL
                head = new Node(element);
                head.next = current;
            } else { // Traverse through the list and Add at given index position > 0
                while (current.next != null && (index - 1) > 0) { // Traverse through the list and make the desired index position decrement till 1
                    current = current.next;
                    index--;
                }
                Node nextItem = current.next;
                Node newNode = new Node(element);
                newNode.next = nextItem;
                current.next = newNode;
            }
            size++;
        }
    }

    public void removeAtPosition(int index, int element) {
        System.out.println("Trying to remove " + element + " at " + index);
        synchronized (lock) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Linked list out of range");
            }
            Node current = head;
            Node nextNode = current.next;
            if (index == 0 && head.data == element) { // Point head to next element
                nextNode = current.next;
                head = nextNode;
            } else {
                while (current.next != null && (index - 1) > 0) { // Traverse through the list and decrement index
                    current = current.next;
                    index--;
                }
                Node removeNode = current.next;
                if (removeNode.data != element) // the data is not equal, dont remove
                    return;
                nextNode = removeNode.next;
                current.next = nextNode;
            }
            size--;
        }
    }

    public int getFirst() {
        synchronized (lock) {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public int getLast() {
        synchronized (lock) {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
    }

    public int size() {
        return size;
    }

    public void printLinkedList() {
        synchronized (lock) {
            Node current = head;
            if (current == null) {
                System.out.println("Linked List empty");
                return;
            }
            while (current.next != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.print(current.data);
            System.out.println();
        }
    }
}