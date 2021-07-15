package counsellorapp;
import java.util.*;
import counsellorapp.HourLinkedList;
import java.sql.Timestamp;
import counsellorapp.Calculator;
import counsellorapp.storagelist;


//
public class Stopwatch extends javax.swing.JFrame implements Runnable {
    Thread t;
    int hcnt= 0, mcnt=0, scnt=0, mscnt=0;// hcnt= hours, mcnt=minutes, scnt= seconds, mscnt= milliseconds
    String str="",nstr="",mstr="",dstr="";
    int cnt=0,cnt2=0;
    HourLinkedList list1 = new HourLinkedList();
    storagelist list2 = new storagelist();
    Calculator Calc1 = new Calculator();
    Timestamp date;
    String activityMain;
    String activitySub;
    double hourSpent;
    Date day = new Date();
  
    
    
    public Stopwatch() {
        initComponents();
        t=new Thread(this);
        reset();
    }
    
    public void reset()
    {
        hcnt=0;mcnt=0;scnt=0;mscnt=0;cnt2=0; 
        nstr="00:00:00";mstr="000";dstr="";
        display();
    }
    
    public void display()
    {
        bDisp1.setText(nstr);
        bDisp2.setText(nstr);
    }
    
    public void seTimeCounter()
    {
        nstr="";
        if(hcnt<10)
        {
            nstr="0"+hcnt;
        }
        else
        {
            nstr=""+hcnt;
        }
        
        if(mcnt<10)
        {
            nstr+=":0"+mcnt;
        }
        else
        {
            nstr+=":"+mcnt;
        }
        
        if(scnt<10)
        {
            nstr+=":0"+scnt;
        }
        
        else
        {
            nstr+=":"+scnt;
        }
    }
    
    public void setMTimerCounter()
    {
        mstr="";
        if(mscnt<10)
        {
            mstr="00"+mscnt;
        }
        else if(mscnt>=10 && mscnt<100)
        {
            mstr="0"+mscnt;
        }
        else
        {
            mstr=""+mscnt;
        }
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                mscnt++;
                if(mscnt>999)
                {
                    mscnt=0;
                    scnt++;
                }
                
                if(scnt>59)
                {
                    scnt=0;
                    mcnt++;
                }
                
                if(mcnt>59)
                {
                    mcnt=0;
                    hcnt++;
                }
                
                if(hcnt>99)
                {
                    reset();
                }
                seTimeCounter();
                setMTimerCounter();
                display();
                Thread.sleep(1);
            }
        }    
        catch(Exception e){}
    }
       
    public void PrintToList()
    {
        cnt2++;
        dstr+="/m"+cnt2+") "+bDisp1.getText()+" "+bDisp2.getText()+"\n";
        textList.setText(dstr);
        //INSERT INTO MYTABLE1 Values (dstr);
    }
    
           
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bDisp1 = new javax.swing.JLabel();
        bDisp2 = new javax.swing.JLabel();
        bthStart = new javax.swing.JButton();
        bthreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textList = new javax.swing.JTextArea();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bDisp1.setFont(new java.awt.Font("Times New Roman", 3, 70)); // NOI18N
        bDisp1.setText("88:88:88");

        bDisp2.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        bDisp2.setText("888");

        bthStart.setText("Start");
        bthStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthStartActionPerformed(evt);
            }
        });

        bthreset.setText("Reset");
        bthreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthresetActionPerformed(evt);
            }
        });

        textList.setColumns(20);
        textList.setRows(5);
        jScrollPane1.setViewportView(textList);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(bDisp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDisp2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(bthStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDisp1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDisp2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthStart)
                    .addComponent(bthreset)
                    .addComponent(Save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthStartActionPerformed
        if(bthStart.getText().equals("Start"))
        {
            bthStart.setText("Stop");
            cnt++;
            if(cnt==1)
            {
                t.start();
            }
            else
            {
                t.resume();
            }
        }
        else
        {
            bthStart.setText("Start");
            t.suspend();
            PrintToList();
        }
    }//GEN-LAST:event_bthStartActionPerformed

    private void bthresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthresetActionPerformed
        reset();
        t.suspend();
        bthStart.setText("Start");
        textList.setText("");  
    }//GEN-LAST:event_bthresetActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        calculatehourSpent();// add save method afterwards
        list1.addNode(hourSpent);
        findDateandhourSpent();
        list2.addNode(activityMain, activitySub, hourSpent, date);
        Calc1.set_listCopy(list2);
        t.suspend();
        
    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */ 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stopwatch().setVisible(true);
            }
        });
    }
    
    private double calculatehourSpent()
    {
        hourSpent= (double) hcnt + ( (double) mcnt/60) + ( (double) scnt/3600);//hcnt=hours, mcnt = minutes, scnt=seconds
        System.out.println(hourSpent);
        return hourSpent;
    }
    
    public void findDateandhourSpent()
    {
        long time = day.getTime();
        Timestamp date = new Timestamp(time);
        hourSpent = calculatehourSpent();
    }
    
    public double findhours()
    {
        return hourSpent;
    }
    
    public String setactivityMain(String activityMain){
         this.activityMain = activityMain;  
         return activityMain;  
    }
    
    public String setactivitySub(String activitySub){
         this.activitySub = activitySub;  
         return activitySub;
    }
    
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JLabel bDisp1;
    private javax.swing.JLabel bDisp2;
    private javax.swing.JButton bthStart;
    private javax.swing.JButton bthreset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textList;
    // End of variables declaration//GEN-END:variables
              
}