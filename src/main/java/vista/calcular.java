
package vista;

import controlador.Abstractfactoryoperacion;
import controlador.operacionesfactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ABRAHAM
 */
public class calcular extends javax.swing.JFrame implements ActionListener{

    
    public Abstractfactoryoperacion factory;
    private double a, b;
    private String operacioneSeleccionada;
    /**
     * Creates new form calcular
     */
    public calcular() {
        initComponents();
        factory = new operacionesfactory();
        bdivide.addActionListener( this);
        bmultiplica.addActionListener(this);
        bresta.addActionListener(this);
        bsuma.addActionListener(this);
        bresultado.addActionListener(this);
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bsuma = new javax.swing.JButton();
        bdivide = new javax.swing.JButton();
        bmultiplica = new javax.swing.JButton();
        bresta = new javax.swing.JButton();
        bresultado = new javax.swing.JButton();
        txresultados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bsuma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bsuma.setText("+");

        bdivide.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bdivide.setText("/");

        bmultiplica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bmultiplica.setText("x");
        bmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiplicaActionPerformed(evt);
            }
        });

        bresta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bresta.setText("-");

        bresultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        bresultado.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsuma, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdivide, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(bresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(bresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(txresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(bresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bdivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsuma, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultiplicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmultiplicaActionPerformed

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
            java.util.logging.Logger.getLogger(calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bmultiplica;
    private javax.swing.JButton bresta;
    private javax.swing.JButton bresultado;
    private javax.swing.JButton bsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txresultados;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == bsuma || e.getSource() == bresta
                || e.getSource() == bmultiplica || e.getSource() == bdivide) {//CAPTURAR VALOR PARA LA OPERACION
            a = Double.parseDouble(txresultados.getText());
            txresultados.setText(""); //LIMPIANDO PARA EL SIGUIENTE VALOR
            operacioneSeleccionada = e.getActionCommand(); // GUARDANDO LA OPERACION SELECCIONADA
        } else if (e.getSource() == bresultado) { //CAPTURANDO EL SIGUIENTE VALOR PARA CALCULAR
            b = Double.parseDouble(txresultados.getText());
            txresultados.setText("");
            if (operacioneSeleccionada.equals("+")) { // EFECTUANDO LA OPERACION SELECCIONADA
                double resultado = factory.efectuarsuma().calcular(a, b);
                txresultados.setText(String.valueOf(resultado));
            } else if (operacioneSeleccionada.equals("-")) {
                double resultado = factory.efectuarresta().calcular(a, b);
                txresultados.setText(String.valueOf(resultado));
            } else if (operacioneSeleccionada.equals("X")) {
                double resultado = factory.efectuarmultiplicacion().calcular(a, b);
                txresultados.setText(String.valueOf(resultado));
            } else if (operacioneSeleccionada.equals("/")) {
                double resultado = factory.efectuardivision().calcular(a, b);
                txresultados.setText(String.valueOf(resultado));
            }
        }
      
    
    }
}
