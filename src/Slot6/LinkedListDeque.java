/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot6;

/**
 *
 * @author Admin
 */
public class LinkedListDeque {

    class Node {

        int data;
        Node prev, next;

        public Node(int x, Node prev, Node next) {
            this.data = x;
            this.prev = prev;
            this.next = next;
        }

        public Node(int x) {
            this(x, null, null);
        }
    }
    Node head, tail;

    public LinkedListDeque() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addLast(int x) {
        if (isEmpty()) {
            head = tail = new Node(x);
        } else {
            Node newNode = new Node(x);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
//            tail = new Node(x, tail, null);

        }
    }

     public void traverse() 
     {
        if (isEmpty()) {
            System.out.println("deque is empty");
        } else {
            Node current = head;
            while (current != null) 
            {
                System.out.print(current.data + "  ");
                current = current.next;
            }
            System.out.println("");
            while (current != null) {
                System.out.print(current.data + "  ");
                current = current.prev;
            }

        }
    }

     public void addFirst(int x) {
        if (isEmpty()) {
            head = tail = new Node(x);

        } else {
            Node newNode = new Node(x);
            head.prev = newNode;
            newNode.next = head;
            head=newNode;
//            head = new Node(x, null, head);
        }
    }
//    Node removeLast()
//    {
//        if(isEmpty()) System.out.print("deQueue is empty");
//        else
//        {
////            Node current = tail;
//            tail = tail.prev;
//            
//        }
//        return null;
//    }

    public Node removeFirst() {
        if (isEmpty()) {
            System.out.print("deQueue is empty");
            return null;
        } else {
            Node temp;
            if (head == tail) {
                temp = head;
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            {
//            Node current = head;

            }
            return null;
        }
    }

    public Node removeLast() {
        if (isEmpty()) {
            System.out.println("empty");
            return null;
        } else {
            Node temp;
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail = null;
            }
            return null;
        }

    }

    public Node first() {
        if (isEmpty()) {
            System.out.println("empty");
            return null;
        } else {
            return head;
        }
    }

    public Node last() {
        if (isEmpty()) {
            System.out.println("empty");
            return null;
        } else {
            return tail;
        }
    }
    public static void main(String[] args) {
        LinkedListDeque listDeque = new LinkedListDeque();
        listDeque.traverse();
        listDeque.addFirst(6);
        listDeque.addLast(5);
        listDeque.addFirst(9);
        listDeque.addLast(12);
        listDeque.addFirst(2);
        listDeque.traverse();
    }

}
