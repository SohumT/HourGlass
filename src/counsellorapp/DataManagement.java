/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counsellorapp;

import java.sql.Timestamp;
import java.io.Serializable;


/**
 *
 * @author sohumsanjaythadani
 */
public class DataManagement implements Serializable {

 
    String activityMain;
    String activitySub;
    double hourSpent;
    Timestamp date;
    
    public DataManagement(String activityMain,String activitySub, double hourSpent, Timestamp date)
    {
       this.activityMain = activityMain;
       this.activitySub = activitySub;
       this.hourSpent = hourSpent;
       this.date = date;
    }

    
    public String getactivityMain()
    {
        return activityMain;
    }
    
    public String getactivitySub()
    {
        return activitySub;
    }
    
    public double gethourspent()
    {
        return hourSpent;
    }   
    
    public Timestamp gettimeStamp()
    {
        return date;
    }
    
    public String setactivityMain(String activityMain)
    {
      this.activityMain = activityMain;  
      return activityMain;
    }
    
    public String setactivitySub(String activitySub)
    {
        this.activitySub = activitySub;
        return activitySub;
    }
    
    public double sethourSpent(double hourSpent)
    {
        this.hourSpent = hourSpent;
        return hourSpent;
    }
    
    public Timestamp settimeStamp (Timestamp date)
    {
        this.date = date;
        return date;
    }
}
