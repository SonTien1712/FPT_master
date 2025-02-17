/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot7;

/**
 *
 * @author Admin
 */
public class BInaryTree {

    class Node {

        int data;
//        int lchild, rchild, parent;

        public Node(int x) {
            this.data = data;
//            this.parent = parent;

        }
    }

    int length; //total number of nodes
    int capacity; // size of array used to contain nodes

    Node[] arrayNodes;

    public BInaryTree(int capacity) {
        this.length = 0;
        this.capacity = capacity;
        this.arrayNodes = new Node[capacity];
    }

    public BInaryTree() {
        this(7);
    }

    boolean isEmpty() {
        return length == 0;
    }

    boolean isFull() {
        return length == capacity;
    }

    void insert(int x) {
        if (isFull()) {
            increaseSize();
        } //            if(isEmpty()) arrayNodes[0] = new Node(x );
        //            else{
        //                
        //            }
        else {
            arrayNodes[length++] = new Node(x);
        }
    }

    void increaseSize() {

    }

    void preOrder(int root) {
        if (root >= length) {
            return;
        }
        if (isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.print(arrayNodes[root].data + "   ");
            //visit left child
//                int lChild = 2*root+1;
//                preOrder(lChild);
            preOrder(2 * root + 1);

            //visit right child
            int rChild = 2 * root + 2;
            preOrder(rChild);
        }
    }

    void preOrder() {
        preOrder(0);
    }

    void postOrder(int node) {
        if (node >= length) {
            return;
        }
        if (isEmpty()) {
            System.out.println("Empty");
        } else {

            //visit left child
            postOrder(2 * node + 1);

            //visit right child
            postOrder(2 * node + 2);

            //print data
            System.out.print(arrayNodes[node].data + "   ");

        }
    }

    void inOrder(int node) {
        if (node >= length) {
            return;
        }
        if (isEmpty()) {
            System.out.println("Empty");
        } else {

            //visit left child
            inOrder(2 * node + 1);

            //print data
            System.out.print(arrayNodes[node].data + "   ");

            //visit right child
            inOrder(2 * node + 2);

        }
    }

    public static void main(String[] args) {
        BInaryTree bt = new BInaryTree(8);
        bt.insert(10);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);
        bt.insert(6);
        bt.insert(4);
        bt.insert(2);
        bt.preOrder(0);
        System.out.println("-----");
        bt.postOrder(0);
        System.out.println("-----");
        bt.inOrder(0);
    }
}
