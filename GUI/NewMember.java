/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class NewMember extends javax.swing.JFrame {

    public void date(){
    java.util.Date date=new java.util.Date();
//Date date=new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    String startday =sdf.format(date);
   jLabel14.setText(startday);
        }
    public NewMember() {
        initComponents();
        try{
            int id=1;
            String str1=String.valueOf(id);
            jLabel2.setText(str1);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdata","root","");
            Statement stmid=con.createStatement();
            ResultSet rsid=stmid.executeQuery("select max(id) from newmember");
            
            while(rsid.next()){
                id=rsid.getInt(1);
                id=id+1;
                String strs=String.valueOf(id);
                jLabel2.setText(strs);
            }
            int reciptno=1;
            String str2=String.valueOf(reciptno);
            jLabel4.setText(str2);
            Statement stmreciptno=con.createStatement();
            ResultSet rsreciptno=stmreciptno.executeQuery("select max(reciptno) from newmember");
            
            while(rsreciptno.next()){
                reciptno=rsreciptno.getInt(1);
                reciptno=reciptno+1;
                String strs=String.valueOf(reciptno);
                jLabel4.setText(strs);
            }
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
//        conn=(Connection) databasedb.openConnection();
        date();

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 135, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 118, 220));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-new-member-on-a-group-messenger-added-recently-60.png"))); // NOI18N
        jLabel16.setText("New Member");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 37, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-25.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 37, 40, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Member ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 155, 87, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 0, 0));
        jLabel2.setText("0000");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 155, 67, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("Recipt No:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 155, 87, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 0, 0));
        jLabel4.setText("0000");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 155, 74, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 190, 69, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 220, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("Mobile Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 259, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 289, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 204));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 330, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 360, 350, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 204));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 401, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(113, 223, 231));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 118, 220));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 431, 350, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 204));
        jLabel10.setText("Day Of Birth");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 470, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 498, 350, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 118, 220));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-reset-24 (2).png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 120, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 118, 220));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-save-all-24.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 568, 350, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 118, 220));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "From our Website", "From Your Friend" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 497, 350, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 204));
        jLabel15.setText("Payment");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 335, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 431, 350, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 204));
        jLabel13.setText("Start Day");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 118, 220));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 573, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 204));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 538, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 204));
        jLabel11.setText("How you Know us");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 467, -1, 23));

        jComboBox3.setBackground(new java.awt.Color(113, 223, 231));
        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 118, 220));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Payment", "100", "800", "2000", "3300 ", "6000" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 365, 350, -1));

        jComboBox4.setBackground(new java.awt.Color(113, 223, 231));
        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 118, 220));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Package", "CrossFit", "Kickboxing", "Weightlifting", "pilates", "Yoga" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 294, 350, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 204));
        jLabel18.setText("Extra Package");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 264, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 255, 204));
        jLabel19.setText("Medical comments");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 401, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 0, 1));
        jLabel14.setText("DD-MM-YYYY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 130, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdobeStock_239063806_Preview (1).jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NewMember().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         try{
        //String driver="com.mysql.cj.jdbc.Driver";
        //Class.forName(driver);
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdata","root","");
    System.out.println("good");
    String id=jLabel2.getText();
    String reciptno=jLabel4.getText();
    String name=jTextField1.getText();
    String mobilenumber=jTextField2.getText();
    String email=jTextField3.getText();
    String gender=(String)jComboBox1.getSelectedItem();
    String dayofbirth=jTextField5.getText();
    String address=jTextField4.getText();
    String startday=jLabel14.getText();
    String extrapackage=(String)jComboBox4.getSelectedItem();
    String payment=(String)jComboBox3.getSelectedItem();
    String medicalcomments=jTextField9.getText();
    String howyouknowus=(String)jComboBox2.getSelectedItem();

    Statement stm=con.createStatement();
    String sql="insert into newmember (id,reciptno,name,mobilenumber,email,gender,dayofbirth,address,startday,extrapackage,payment,medicalcomments,howyouknowus)Values('"+id+"','"+reciptno+"','"+name+"','"+mobilenumber+"','"+email+"','"+gender+"','"+dayofbirth+"','"+address+"','"+startday+"','"+extrapackage+"','"+payment+"','"+medicalcomments+"','"+howyouknowus+"')";
    //ResultSet rs=stm.executeQuery(sql);
    if(jTextField1.getText().length()<=0||jTextField2.getText().length()<=0||jTextField3.getText().length()<=0||jTextField5.getText().length()<=0||jTextField4.getText().length()<=0||jComboBox4.getSelectedIndex()==0||jComboBox3.getSelectedIndex()==0||jTextField9.getText().length()<=0)
        JOptionPane.showMessageDialog(null,"Please Complete Information");
    else{
    stm.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"saved");
    dispose();
    setVisible(false);
    new NewMember().setVisible(true);
    }
    } 
    
    catch(SQLException e){
JOptionPane.showMessageDialog(null,e);
//    e.printStackTrace();
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
