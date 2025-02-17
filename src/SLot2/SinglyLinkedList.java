/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLot2;

/**
 *
 * @author Admin
 */
public class SinglyLinkedList {

    public static class Node {

        int data;
        Node next;

        public Node() {
        }

        public Node(int x) {
            data = x;
            next = null;
        }

    }
    Node head, tail;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
        tail = head;
    }

    boolean isEmpty() {
        return head == null;
    }

    /*
    Write a function to add new node to the last of linked list
     */
    void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;

        }
    }

    /*
    Write a function to display the data of the nodes
     */
    void displayData() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /*
    write a function to add new nodes to the head of the list
     */
    void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /*
    Write a function to remove the last
     */
    void removeTail() {

        if (isEmpty()) {
            System.out.print("Empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node node = head;

            while (node.next != tail) {
                node = node.next;

            }
            node.next = null;
            tail = node;

        }
    }

    /* Write a function to remove head
    
     */
    void removeHead() {
        if (isEmpty()) {
            System.out.print("Empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            if (head.next != null) {
                head = head.next;
            }

        }

    }

    /*
    Write a function to remove a node have a specific data
    
     */
    public void removeData(int data) {
        if (isEmpty()) {
            System.out.print("Empty");

        } else {
            Node current = head;
            while (current != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                } else {
                    current = current.next;
                }
            }

        }
    }

    /*
    Write a function to remove specific data
     */
    void removeMoreData(int x) {
        if (isEmpty()) {
            System.out.println("Empty");

        } else {
            while (head != null && head.data == x) {
                head = head.next;
            }
            if (head == null) {
                tail = null;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data == x) {
                    temp.next = temp.next.next;

                } else {
                    temp = temp.next;
                }
            }
            if (head.data == x) {
                head = head.next;
                return;
            }

        }
  
    }
}
