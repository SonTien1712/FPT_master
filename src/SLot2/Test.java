/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLot2;

/**
 *
 * @author Admin
 */
public class Test {
    
    public static void main(String args[])
    {
        System.out.print("Hello guy");
        
        
        
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.addFirst(3);
        sll.addFirst(3);
        sll.addFirst(3);
        sll.addFirst(3);        
        sll.addLast(4);
        sll.addLast(5);
        sll.addLast(6);
        
        sll.removeTail();
        sll.displayData();
    }
}
