/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counsellorapp;


/**
 *
 * @author sohumsanjaythadani
 */
public class HourLinkedList {
    
    class Node{
        double hours;
        Node next;
        public Node(double hours){
            this.hours = hours;
            this.next = null;
        }    
    }
    
    public Node head = null;
    public Node tail = null;
    
    public void addNode(double hours)
    {
        Node newNode = new Node(hours);
        
        if(head == null){
            head = newNode;
            tail = newNode;
            
        }
        
        else{
            tail.next = newNode;
            tail = newNode;
            
        }
    }
    
    public void display()
    {
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null)
        {
            System.out.print(current.hours+ "");
            current = current.next;
        }
        System.out.println();
    }
    
    public double gethours()
    {
       return head.hours;
    }
   
    
    public static void main(String[] args){
   
    }
      
}
