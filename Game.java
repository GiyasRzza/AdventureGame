
package AdventureGame;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Game extends javax.swing.JFrame {
    private String message;
    public Game() {
            setSize(400,400);
        setResizable(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
    }

 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 255));
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(20);
        jTextArea1.setText("Siz  hekayədə olmayan seçimi etdiniz və müəllifin yaratdığı xəyali hekayəyə başlayırsınız");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Başla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       message="Salam oyun başlayır...";
        JOptionPane.showMessageDialog(this, message);
        message="Uşaqlar qaranlıq tərəfə getdikdən sonra qarşılarna bir quyu çıxır";
        JOptionPane.showMessageDialog(this, message);
        message="Cırtdan qətiyyətlə o quyudan su içmək istıyir";
        JOptionPane.showMessageDialog(this, message);
        message="Cırtdan o quyudan su içsin?";
        
         int option= JOptionPane.showConfirmDialog(this, message);
        if (option==JOptionPane.OK_OPTION) {
            message="Cirtdan sudan icmək istəyərkən quyuya düşür ve boğulur\n"
                    + "Dostlarıda bu ani durumdan qorxduqları ücün ona kömək edə bilmirlər və cirtdan ölür!...";
            JOptionPane.showMessageDialog(this, message);
                  
        }else if(option==JOptionPane.NO_OPTION){
                message="Cirtdan su içmək istəyərkən dostları onu quyuya yaxinlaşmağa qoymurlar\n"
                        + "Bu duruma hirslənən cırtdan onlardan küsür,və kəndə çatana qədər onlarla danışmır";
                JOptionPane.showMessageDialog(this, message);
                
                message="Bir zaman yol getdikdən sonra kəndə çatırlar\n"
                        + "Kəndə çatan zaman görürlərki kənddə heçkim yoxdur\n"
                        + "Div onların kəndinə hücum edərək bütün kəndi öldürüb";
                JOptionPane.showMessageDialog(this, message);
                
                message="Xeyli bir zaman keçir,cırtdan böyüyür ve dostları ona BASAT ləqəbin qoyurlar....";
                  JOptionPane.showMessageDialog(this, message, "20 il sonra..",
        JOptionPane.INFORMATION_MESSAGE);
                  
                  message="Cirtdan  Bir gün meşədə gəzərkən Divlə qarşılaşır\n"
                          + "Cirtdan oradan qaçsin? (cancel durumunda oyun baglanir...)";
                  int choose= JOptionPane.showConfirmDialog(this, message);
                  if (choose==JOptionPane.OK_OPTION) {
                            message="Cirtdan oradan qaçarken ayaqı ilişir ve yerə yixilir bu durumda başini zedeleyir\n"
                                    + "Divde onun qaçdiqini görüb ona hücum ederek onuda öldurur ";
                            JOptionPane.showMessageDialog(this, message);
                 
            }else if(choose==JOptionPane.NO_OPTION){
                            message="Cirtdan Divi gorub ona hücum edir ve qılıcı ile onun gözünı zerbe endirir ve divi öldürür,\n"
                                    + "Beləliklə O öz kəndinin Basatı,Vı qəhramanı olur";
                              JOptionPane.showMessageDialog(this, message);
                  }
            else{
            message="Oyun bağlanır...";
              JOptionPane.showMessageDialog(this, message);
              System.exit(0);
              
            }        
            
        }
        
        else{
        message="Oyun bağlanır";
          JOptionPane.showMessageDialog(this, message);
          System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Game().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
