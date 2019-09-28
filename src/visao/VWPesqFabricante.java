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
public class VWPesqFabricante extends javax.swing.JFrame {

    /**
     * Creates new form VWPesqFabricante
     */
    public VWPesqFabricante() {
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

        jLabel3 = new javax.swing.JLabel();
        jtcnpj = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jtnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbcancelar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();
        jlaviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 205));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Pesquisa de Usuario");

        jLabel1.setText("CNPJ:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jbcancelar.setText("Cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jbeditar.setText("Editar");
        jbeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarActionPerformed(evt);
            }
        });

        jbexcluir.setText("Excluir");
        jbexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexcluirActionPerformed(evt);
            }
        });

        jlaviso.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlaviso, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jbcancelar)
                .addGap(116, 116, 116)
                .addComponent(jbeditar)
                .addGap(18, 18, 18)
                .addComponent(jbexcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel1))
                .addGap(86, 86, 86)
                .addComponent(jlaviso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcancelar)
                    .addComponent(jbeditar)
                    .addComponent(jbexcluir))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addContainerGap(144, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        jlaviso.setText("");
        String id;

        //Zona zona = new Zona();
        if ("".equals(jtcnpj.getText()) || jtcnpj.getText() == null) {
            jtnome.setText("");
            jlaviso.setForeground(Color.red);
            jlaviso.setText("*Por favor preencha o campo CNPJ");
            jtcnpj.requestFocus();

        } else {
            FabricanteDao fdao = new FabricanteDao();
            id = jtcnpj.getText();
            try {
                Fabricante fabricante = fdao.Buscar(id);
                if (!fabricante.getFacnpj().equals(id) || jtcnpj.getText() == null) {
                    System.out.println("*Fabricante não cadastrado");
                    jlaviso.setForeground(Color.red);
                    jlaviso.setText("*Fabricante não Cadastrado");
                } else {
                    //jtCodigo.setText(zona.getZoid());
                    jtnome.setText(fabricante.getFanome());

                }

            } catch (SQLException ex) {
                System.out.println("*Erro ao Buscar " + ex.getMessage());
                jlaviso.setForeground(Color.red);
                jlaviso.setText("*Erro ao Buscar " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarActionPerformed
        jlaviso.setText("");
        //int id;
        Fabricante fabricante = new Fabricante();
        FabricanteDao fdao = new FabricanteDao();
        fabricante.setFacnpj(jtcnpj.getText());
        fabricante.setFanome(jtnome.getText());
        
        try {
            fdao.Alterar(fabricante);
            System.out.println("*Fabricante Alterado");
            jlaviso.setForeground(Color.green.darker());
            jlaviso.setText("*Fabricante Alterado");
            jtnome.setText("");
            jtcnpj.setText("");
            //jtlogin.setText("");
            //jpsenha.setText("");

        } catch (SQLException ex) {
            System.out.println("*Erro ao Alterar " + ex.getMessage());
            jlaviso.setForeground(Color.red);
            jlaviso.setText("*Erro ao Alterar " + ex.getMessage());
        }

        /*try {
            //Zona zona = zdao.Buscar(id);
            if(zona==null){
                System.out.println("Zona não cadastrada");
                jlaviso.setForeground(Color.red);
                jlaviso.setText("Zona não Cadastrada");
            }else{
                //jtCodigo.setText(zona.getZoid());
                jtnome.setText(zona.getZonome());

            }

        } catch (SQLException ex) {
            System.out.println("Erro ao Buscar" +ex.getMessage());
            jlaviso.setForeground(Color.red);
            jlaviso.setText("Erro ao Buscar" +ex.getMessage());
        }// TODO add your handling code here:*/
    }//GEN-LAST:event_jbeditarActionPerformed

    private void jbexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcluirActionPerformed
        jlaviso.setText("");
        String id;
        //Zona zona = new Zona();
        FabricanteDao fdao = new FabricanteDao();
        id = (jtcnpj.getText());
        //zona.setZoid(Integer.parseInt(jtcodigo.getText()));
        //zona.setZonome(jtnome.getText());

        try {
            fdao.Excluir(id);
            System.out.println("*Usuario Excluido");
            jlaviso.setForeground(Color.green.darker());
            jlaviso.setText("*Usuario Excluido");
            jtnome.setText("");
            jtcnpj.setText("");
            //jtlogin.setText("");
            //jpsenha.setText("");

        } catch (SQLException ex) {
            System.out.println("*Erro ao Excluir " + ex.getMessage());
            jlaviso.setForeground(Color.red);
            jlaviso.setText("*Erro ao Exluir " + ex.getMessage());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jbexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(VWPesqFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VWPesqFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VWPesqFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VWPesqFabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VWPesqFabricante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbeditar;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JLabel jlaviso;
    private javax.swing.JTextField jtcnpj;
    private javax.swing.JTextField jtnome;
    // End of variables declaration//GEN-END:variables
}
