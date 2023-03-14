package com.rc.tech;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int item) {
        Node node = new Node(item);

        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public boolean hasLoop() {
        Set<Node> visited = new HashSet<>();
        Node curr = head;

        while (curr != null) {
            if (visited.contains(curr)) {
                return true;
            }
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public void removeLoop() {
        Node curr = head;
        Node prev = null;
        Set<Node> visited = new HashSet<>();

        while (curr != null) {
            if (visited.contains(curr)) {
                prev.next = null;
                return;
            }
            visited.add(curr);
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // create a loop
        list.head.next.next.next.next.next = list.head.next;

        if (list.hasLoop()) {
            System.out.println("Loop detected");
            list.removeLoop();
            System.out.println("Loop removed");
        } else {
            System.out.println("No loop detected");
        }
    }

}
