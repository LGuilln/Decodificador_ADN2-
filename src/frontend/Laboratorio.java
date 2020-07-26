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
public class Laboratorio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio1
     */
    public Laboratorio() {
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

        B_Comparar = new javax.swing.JButton();
        B_Back = new javax.swing.JButton();
        B_Exit = new javax.swing.JButton();
        B_NUevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        entrada2 = new javax.swing.JTextField();
        cadenarepetida = new javax.swing.JLabel();
        entrada1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Comparar.setBackground(new java.awt.Color(102, 255, 0));
        B_Comparar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_Comparar.setText("Comparar");
        B_Comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CompararActionPerformed(evt);
            }
        });
        getContentPane().add(B_Comparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 230, 50));

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

        B_NUevo.setBackground(new java.awt.Color(102, 255, 0));
        B_NUevo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        B_NUevo.setText("Nuevo");
        B_NUevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_NUevoActionPerformed(evt);
            }
        });
        getContentPane().add(B_NUevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 230, 50));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 9, 9));
        jLabel5.setText("Repetida:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 280, 50));

        jLabel3.setBackground(new java.awt.Color(52, 201, 80));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 63));
        jLabel3.setText("\"Analizador de Secuencias ADN\"");
        jLabel3.setAutoscrolls(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 910, 120));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(230, 255, 0));
        jLabel11.setText("Secuencia 1:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 50));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 255, 0));
        jLabel6.setText("Secuencia 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 280, 50));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 9, 9));
        jLabel7.setText("Cadena ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 280, 50));

        entrada2.setBackground(new java.awt.Color(255, 255, 255));
        entrada2.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        entrada2.setForeground(new java.awt.Color(0, 0, 0));
        entrada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrada2ActionPerformed(evt);
            }
        });
        getContentPane().add(entrada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 420, -1));

        cadenarepetida.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 55)); // NOI18N
        cadenarepetida.setForeground(new java.awt.Color(39, 255, 0));
        getContentPane().add(cadenarepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 820, 190));

        entrada1.setBackground(new java.awt.Color(255, 255, 255));
        entrada1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        entrada1.setForeground(new java.awt.Color(0, 0, 0));
        entrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrada1ActionPerformed(evt);
            }
        });
        getContentPane().add(entrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 420, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/images3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CompararActionPerformed
        String base1 = entrada1.getText();
        String base2 = entrada2.getText();
        String repetida = cadenarepetida.getText();
        
        Analizador c = new Analizador();
        String cadena_r = c.cadenaRepetida(base1, base2, repetida);
        cadenarepetida.setText(cadena_r);
    }//GEN-LAST:event_B_CompararActionPerformed

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

    private void B_NUevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_NUevoActionPerformed
       this.setVisible(false);
       new Laboratorio().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_B_NUevoActionPerformed

    private void entrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrada1ActionPerformed

    private void entrada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrada2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrada2ActionPerformed

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
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Laboratorio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Comparar;
    private javax.swing.JButton B_Exit;
    private javax.swing.JButton B_NUevo;
    private javax.swing.JLabel cadenarepetida;
    private javax.swing.JTextField entrada1;
    private javax.swing.JTextField entrada2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
