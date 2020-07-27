/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import java.io.File;
import backend.Analizador;


/**
 *
 * @author luedu
 */
public class Informacion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Informacion() {
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

        B_Back = new javax.swing.JButton();
        B_Exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LGuilln = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Back.setBackground(new java.awt.Color(102, 255, 0));
        B_Back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Back.setText("Atras");
        B_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BackActionPerformed(evt);
            }
        });
        getContentPane().add(B_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 230, 50));

        B_Exit.setBackground(new java.awt.Color(102, 255, 0));
        B_Exit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Exit.setText("Exit");
        B_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(B_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 710, 230, 50));

        jLabel3.setBackground(new java.awt.Color(52, 201, 80));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 30, 0));
        jLabel3.setText("\"Analizador de Secuencias ADN\"");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 910, 120));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(230, 255, 0));
        jLabel11.setText("Introducción a la Programación de Computadoras 2 ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 1090, 50));

        LGuilln.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 55)); // NOI18N
        LGuilln.setForeground(new java.awt.Color(39, 255, 0));
        LGuilln.setText("Luis Eduardo Guillen Ruiz");
        getContentPane().add(LGuilln, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 820, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/images3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BackActionPerformed
       this.setVisible(false);
       new Bienvenida().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_B_BackActionPerformed

                                      
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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        File createCarpeta = new File("Persona");
        File createCarpeta1 = new File("Armas");
        File createCarpeta2 = new File("Avioness");
        File createCarpeta3 = new File("Tanquess");
          File createCarpeta4= new File("Partidas");
       if (!createCarpeta.exists()) {
            createCarpeta.mkdir();
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Exit;
    private javax.swing.JLabel LGuilln;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
