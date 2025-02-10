/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot5;

/**
 *
 * @author Admin
 */
public class LinkedListSTack 
{
    class Node
    {
        int data;
        Node next;
        
        public Node(int x, Node next)
        {
            this.data = data;
            this.next = next;
        }
        public Node(int x){this(x,null);}
        
        
        Node head;
        
        
        boolean isEmpty(){
            return head ==null;
        }
        void push(int x)
        {
            Node newNode = new Node(x);
            if(isEmpty())
            {
                head = new Node (x);
            }else
            {
                newNode.next = head;
                head = newNode;
            }
        }
        void traverse()
        {
            if(isEmpty()) System.out.println("the stack is empty");
            else{
                Node current = head;
                while(current != null)
                {
                    System.out.println();
                }
            }
        }
    }
        
}
