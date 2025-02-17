/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3.Stack;

import java.awt.BorderLayout;

/**
 *
 * @author Admin
 */
public class ArrayStack 
{
    class Node{
        int value;
        public Node(int x)
        {
            this.value=x;
        }
    }
    Node[] arrayNode;
    int capacity;
    int top;

    public ArrayStack(int capacity) 
    {
        this.arrayNode = new Node[capacity];
        this.capacity=capacity;
        this.top=-1;
        
    }
    public ArrayStack()
    {
        this(50);
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    boolean isFull()
    {
        return top == capacity-1;
    }
    void increaseCap()
    {
        int newCap = this.capacity*2;
        Node[] newArrayNode = new Node[newCap];
        for(int i=0;i<this.capacity;i++)
        {
            newArrayNode[i]=this.arrayNode[i];
        }
        this.arrayNode=newArrayNode;
        this.capacity=newCap;
    }
    void push(int x)
    {

        if(isFull()) increaseCap();
        arrayNode[top++]= new Node(x);
    }
    void pop()
    {
//        Node pNode = arrayNode[top--];
//        return pNode;
        System.out.println(arrayNode[top--]);
    }
    Node get(int position)
    {
        return arrayNode[position];
    }
}
