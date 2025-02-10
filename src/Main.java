
import Slot6.LinkedListDeque;
import Slot6.Recursion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        LinkedListDeque listDeque = new LinkedListDeque();
        listDeque.traverse();
        listDeque.addFirst(6);
        listDeque.addLast(5);
        listDeque.addFirst(9);
        listDeque.addLast(12);
        listDeque.addFirst(2);
        listDeque.traverse();
        Recursion recur = new Recursion();
        int n =6;
        System.out.print(n);
    }
    
    
}
