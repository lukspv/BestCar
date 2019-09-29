/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.sql.SQLException;
import modelo.dao.FabricanteDao;
import modelo.entidade.Fabricante;

/**
 *
 * @author lucas
 */
public class VWCadFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form VWCadFornecedor
     */
    public VWCadFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jbtsalvar = new javax.swing.JButton();
        jlaviso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtcnpj = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 205));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Cadastro de Fornecedor");

        jbvoltar.setText("<");
        jbvoltar.setBorder(null);
        jbvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jbtsalvar.setText("Salvar");
        jbtsalvar.setToolTipText("Clique para Salvar");
        jbtsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsalvarActionPerformed(evt);
            }
        });

        jlaviso.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setText("CNPJ:");

        try {
            jtcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtcnpj)
                    .addComponent(jtnome, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtsalvar)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jlaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtsalvar)
                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarActionPerformed
        VWInicial inicial = new VWInicial();
        inicial.setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbvoltarActionPerformed

    private void jbtsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsalvarActionPerformed

        if (jtcnpj.equals("") || jtnome.equals("")) {
            jlaviso.setForeground(Color.red);
            jlaviso.setText("*Por favor preencer todos os campos obrigatorios");

        } else {

            Fabricante fabricante = new Fabricante();
            FabricanteDao fdao = new FabricanteDao();
            fabricante.setFacnpj(jtcnpj.getText());
            fabricante.setFanome(jtnome.getText());

            try {
                fdao.Cadastrar(fabricante);
                jtnome.setText("");
                jtcnpj.setText("");
                jlaviso.setForeground(Color.green.darker());
                jlaviso.setText("*Fabrica Salva com Sucesso");

                // TODO add your handling code here:
            } catch (SQLException ex) {
                System.out.println("Erro ao salvar " + ex.getMessage());
                jlaviso.setForeground(Color.red);
                jlaviso.setText("Erro ao Salvar o Fabricante " + ex.getMessage());
            }

        }


    }//GEN-LAST:event_jbtsalvarActionPerformed

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
            java.util.logging.Logger.getLogger(VWCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VWCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VWCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VWCadFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VWCadFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtsalvar;
    private javax.swing.JButton jbvoltar;
    private javax.swing.JLabel jlaviso;
    private javax.swing.JFormattedTextField jtcnpj;
    private javax.swing.JTextField jtnome;
    // End of variables declaration//GEN-END:variables
}
