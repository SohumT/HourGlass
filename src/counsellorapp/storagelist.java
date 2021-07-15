/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counsellorapp;

//import java.io.*;- remove temporarily

import java.sql.Timestamp;


/**
 *
 * @author sohumsanjaythadani
 */
public class storagelist {
    String activityMainSelect;
    String activitySubSelect;
    double hourSummation;
    
class Node extends DataManagement{
        
        Node next;
        double temphours;//variable to temporarily add hours to
        double totalhours;
        
        public Node(String activityMain, String activitySub, double hourSpent, Timestamp date) {
            super(activityMain, activitySub, hourSpent, date);
            this.next = null;
        }
        
    }
    public Node head = null;
    public Node tail = null;
    
    public void addNode(String activityMain, String activitySub, double hourSpent, Timestamp date)
    {
        Node newNode = new Node(activityMain, activitySub, hourSpent, date);
        
        if(head == null){
            head = newNode;
            tail = newNode;
           
        }
        
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public String getactivityMain(){
        return head.activityMain;
    }
    
    public String getactivitySub(){
        return head.activitySub;
    }
    
    
    public double calculateactivitymainSum(String activityMainSelect)
    {
        Node current = head;
        
        while(current != null)
        {
          if(current.activityMain.equals(activityMainSelect)){
             hourSummation += current.gethourspent();
             current = current.next;
          }
          else{
             current = current.next; 
          }
        }
        return hourSummation;
    }
    
    public double calculateactivitysubSum(String activitySubSelect)
    {
        Node current = head;
        
        while(current != null)
        {
            if(current.activitySub.equals(activitySubSelect)){
                hourSummation += current.gethourspent();
                current= current.next;
            }
            else{
                current = current.next;
            }
        }
        return hourSummation;
    }
    
   
}
        
