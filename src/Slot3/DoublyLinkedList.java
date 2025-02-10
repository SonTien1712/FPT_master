/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot3;

import SLot2.SinglyLinkedList.Node;

/**
 *
 * @author Admin
 */
public class DoublyLinkedList 
{
  public static class Node
  {
      int data;
      Node prev,next;
      public Node(){}
      public Node(int data, Node prev, Node next)
      {
          data = data;
          this.prev=prev;
          this.next=next;
      }
      public Node(int x)
      {
          this(x,null,null);
      }
  }
  
  Node head,tail;
  public DoublyLinkedList()
  {
      
  }
  
  
  boolean isEmpty()
  {
      return head==null;
  }
  public void displayList()
  {
      Node current = head;
      while(current!=null)
      {
          System.out.print(current.data + " ");
          current= current.next;
          
      }
      //get the space
      System.out.println();
      
  }
  
  public void forwardTraversal(Node head)
  {
      int result = 0;
      Node current = head;
      if(current!=null)
      {
          System.out.print(current.data +" ");
          current = current.next;
                 
      }
      
  }
  public void backwardTraversal(Node head)
  {
//      int 
  }
  public Node addFirst(Node head, int newData) {        
        Node newNode = new Node(newData);        
        newNode.next = head;        
        if (head != null) {
            head.prev = newNode;
        }       
        return newNode;
    }
  public Node addLast(Node tail, int newData)
  {
      Node newNode = new Node(newData);
      newNode.prev = tail;
      if(tail!=null)
      {
          tail.next = newNode;
      }
      return newNode;
  }
    
}
