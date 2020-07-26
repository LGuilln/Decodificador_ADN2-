/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.io.File;


/**
 *
 * @author luedu
 */
public class Bienvenida extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Bienvenida() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
                                  
/**
 * Método para iniciar el juego
 * @param evt 
 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Lab = new javax.swing.JButton();
        B_Info = new javax.swing.JButton();
        B_Exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Lab.setBackground(new java.awt.Color(102, 255, 0));
        B_Lab.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Lab.setText("Analizar");
        B_Lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LabActionPerformed(evt);
            }
        });
        getContentPane().add(B_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 230, 50));

        B_Info.setBackground(new java.awt.Color(102, 255, 0));
        B_Info.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Info.setText("Informacion");
        B_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InfoActionPerformed(evt);
            }
        });
        getContentPane().add(B_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 230, 50));

        B_Exit.setBackground(new java.awt.Color(102, 255, 0));
        B_Exit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Exit.setText("Exit");
        B_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(B_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 780, 230, 50));

        jLabel3.setBackground(new java.awt.Color(52, 201, 80));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 63));
        jLabel3.setText("Laboratorio de:");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 910, 120));

        jLabel2.setBackground(new java.awt.Color(52, 201, 80));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 63));
        jLabel2.setText("\"ADN\"");
        jLabel2.setAutoscrolls(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 440, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/images1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_LabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LabActionPerformed
        this.setVisible(false);
        new Laboratorio().setVisible(true);

    }//GEN-LAST:event_B_LabActionPerformed

    private void B_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InfoActionPerformed
       this.setVisible(false);
       new Informacion().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B_InfoActionPerformed

                                      
/**
 * Método de Salida
 * @param  
 */
    private void B_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ExitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Bienvenida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Exit;
    private javax.swing.JButton B_Info;
    private javax.swing.JButton B_Lab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
