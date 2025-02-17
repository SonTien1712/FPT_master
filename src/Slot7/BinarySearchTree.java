/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot7;

/**
 *
 * @author Admin
 */
public class BinarySearchTree {
    /*
    using linked list to implement binary search tree
    */
    
    public class Node{
        int data;
        Node left,right;
//        public Node(){ }
      
        public Node(int x)
        {
            
            this.data=x;
            this.left=this.right=null;
        }
    }
    Node root;
    public BinarySearchTree(Node root)
    {
        
        
    }
    public BinarySearchTree()
    {
        this.root =null;
    }
    boolean isEmpty()
    {
        return root==null;
    }
    void insert(int x) {
        if (isEmpty()) 
{
            System.out.println("empty");
        }
    }
    Node insertRec(int x, Node node)
    {
        if(node == null){
            node = new Node(x);
            return node;
        }
        if(x<node.data) node.left=insertRec(x,node.left );
        if(x>node.data) node.right=insertRec(x, node.right);
        return node;
    }
    void insertRec(int x)
    {
        root = insertRec(x, root);
    }

        
        
      
    
    public void preOrder(Node p)
    {
        if(isEmpty()) System.out.println("empty");
        
        
    }
}
