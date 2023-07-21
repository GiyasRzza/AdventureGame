
package AdventureGame;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GameScreen extends javax.swing.JFrame {
    private String message;
    
    public GameScreen() {
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


        private void audioAdd(){
        
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("Main Ses.wav"));
            
            Clip clip = AudioSystem.getClip(); 
            
            clip.open(stream);
            clip.start();
            
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        private void isChoose(){
            
            try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("secim.wav"));
            
            Clip clip = AudioSystem.getClip(); 
            
            clip.open(stream);
            clip.start();
            
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        
        }
        
        private void isLightChoose(){
            try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("isiqli.wav"));
            
            Clip clip = AudioSystem.getClip(); 
            
            clip.open(stream);
            clip.start();
            
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
        
        private void divSpeek(){
        
                    try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("div.wav"));
            
            Clip clip = AudioSystem.getClip(); 
            
            clip.open(stream);
            clip.start();
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Oyuna Bashla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Salam Oyuna Xoş Gəlmisiniz ,Cirtdan hekayəsi əsasında yazılmışdır");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Oyunda səslərdən istifadə edilmişdir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        try {
            audioAdd();
            message="Salam,Oyun başlayır...(Səsləndirmədən sonra Başlaya bilərsiniz)";
            JOptionPane.showMessageDialog(this, message);
            Thread.sleep(35000);
               isChoose();
               Thread.sleep(13000);
               message="Oyun davam edir...";
               JOptionPane.showMessageDialog(this, message);
            message ="İşıq Yanan tərəfə gedmək istıyirsiniz?";
            int reply= JOptionPane.showConfirmDialog(this, message);
            if(reply==JOptionPane.YES_OPTION){
                message = "Siz işıqlı tərəfi seçdiniz!";
                JOptionPane.showMessageDialog(this, message);
                isLightChoose();
                Thread.sleep(11000);
                divSpeek();
                Thread.sleep(10000);
                message="Divlə qarşılaşırlar və sonra div onları yemək istəyir\n"
                        + "Cırtdanın verdiyi məntiqli qərarla uşaqlar Divdən qurtula bilir və hekayə xoşbəxtliklə bitir...";
                JOptionPane.showMessageDialog(this, message);
                

            }
            else if(reply==JOptionPane.CANCEL_OPTION) {
                message="Oyundan çıxılır...";
                JOptionPane.showMessageDialog(this, message);
                System.exit(0);
            }
            else if(reply==JOptionPane.NO_OPTION){
                setVisible(false);
                Game game  = new Game();
                game.setVisible(true);
               
            
            }
            else{
                 message = "Daxili Xeta";
                 
                 JOptionPane.showMessageDialog(this, message);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(GameScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

 
}
