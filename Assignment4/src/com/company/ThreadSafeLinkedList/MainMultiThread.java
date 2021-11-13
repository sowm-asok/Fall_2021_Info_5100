package com.company.ThreadSafeLinkedList;

public class MainMultiThread implements Runnable {

    static LinkedListThreadSafe ll = new LinkedListThreadSafe();

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MainMultiThread());

        Thread thread2 = new Thread(new MainMultiThread());
        System.out.println("Starting");
        printStatus();
        System.out.println("=======\n\n");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\n\n=======");
        System.out.println("Ending");
        printStatus();
    }

    @Override
    public void run() {
        // Add a series of data
        ll.addAtPosition(0, 1);
        ll.addAtPosition(1, 3);
        ll.addAtPosition(2, 5);
        ll.addAtPosition(3, 7);
        ll.addAtPosition(4, 9);

        printStatus();

        ll.removeAtPosition(2, 5);
        ll.removeAtPosition(0, 1);

        printStatus();
    }

    private static void printStatus() {
        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("Size: " + ll.size());
        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        ll.printLinkedList();
    }
}