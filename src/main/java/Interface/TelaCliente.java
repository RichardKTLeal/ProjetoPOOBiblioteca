/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import beans.Cliente;
import DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author richa
 */
public class TelaCliente extends javax.swing.JFrame {

    
    private void preencherTabelas() throws SQLException{
          ClienteDAO cliente = new ClienteDAO();
          List<Cliente> clientes = cliente.allCliente();
          
          DefaultTableModel tabelaCliente = (DefaultTableModel) tblCliente.getModel();
          
          tabelaCliente.setNumRows(0);
        
        for(Cliente c : clientes){
            Object[] obj;
            obj = new Object[]{
                c.getidCliente(),
                c.getNomeCliente(),
                c.getEmailCliente(),
                c.getTelefoneCliente(),
                c.getcpfCliente()
            };
            tabelaCliente.addRow(obj);
    }     
    }
    public TelaCliente() throws SQLException {
        initComponents();
        preencherTabelas();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        emailCliente = new javax.swing.JTextField();
        telefoneCliente = new javax.swing.JTextField();
        adicionarFuncionario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        removerFuncionario = new javax.swing.JButton();
        alterarFuncionario = new javax.swing.JButton();
        cpfCliente = new javax.swing.JTextField();
        txtEventosF = new javax.swing.JLabel();
        txtEventosV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nome");

        jLabel5.setText("Telefone");

        jLabel6.setText("CPF");

        jLabel7.setText("E-Mail");

        adicionarFuncionario.setText("Adicionar");
        adicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFuncionarioActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-Mail", "Telefone", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setResizable(false);
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCliente.getColumnModel().getColumn(1).setResizable(false);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCliente.getColumnModel().getColumn(2).setResizable(false);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblCliente.getColumnModel().getColumn(3).setResizable(false);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(75);
            tblCliente.getColumnModel().getColumn(4).setResizable(false);
            tblCliente.getColumnModel().getColumn(4).setPreferredWidth(75);
        }

        jLabel2.setText("ID Cliente: ");

        removerFuncionario.setText("Remover");
        removerFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFuncionarioActionPerformed(evt);
            }
        });

        alterarFuncionario.setText("Alterar");
        alterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFuncionarioActionPerformed(evt);
            }
        });

        txtEventosF.setForeground(new java.awt.Color(255, 0, 0));

        txtEventosV.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(4, 4, 4)
                                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adicionarFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removerFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(alterarFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(emailCliente))
                                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneCliente)
                            .addComponent(cpfCliente)
                            .addComponent(txtEventosF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEventosV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEventosF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEventosV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarFuncionario)
                    .addComponent(removerFuncionario)
                    .addComponent(alterarFuncionario)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFuncionarioActionPerformed
        idCliente.setText("");
        try {
            
            txtEventosV.setText("");
            txtEventosF.setText("");
            ClienteDAO cliente = new ClienteDAO();
            Cliente cli = new Cliente();
            
            cli.setNomeCliente(nomeCliente.getText());
            cli.setEmailCliente(emailCliente.getText());
            cli.setTelefoneCliente(telefoneCliente.getText());
            cli.setcpfCliente(cpfCliente.getText());
            
            
            if(nomeCliente.getText().isEmpty() || emailCliente.getText().isEmpty() || telefoneCliente.getText().isEmpty() || cpfCliente.getText().isEmpty()){
                txtEventosF.setText("Confira se não há informações faltando");
            }else{
                
                DefaultTableModel tabelaCliente = (DefaultTableModel) tblCliente.getModel();
                
                Object[] dados = {
                    cli.getNomeCliente(),
                    cli.getEmailCliente(),
                    cli.getTelefoneCliente(),
                    cli.getcpfCliente()
                };
                tabelaCliente.addRow(dados);
                
                try {
                    cliente.inserirCliente(cli);
                    preencherTabelas();
                    nomeCliente.setText("");
                    emailCliente.setText("");
                    telefoneCliente.setText("");
                    cpfCliente.setText("");
                    
                    txtEventosV.setText("Cliente cadastrado com sucesso");
                } catch (SQLException ex) {
                    Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                    txtEventosF.setText("Ouve um erro ao cadastrar o cliente");
                    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adicionarFuncionarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void removerFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFuncionarioActionPerformed
          try {
            ClienteDAO cliente = new ClienteDAO();
            Cliente cli = new Cliente();
            
            cliente.ExcluirCliente(Integer.parseInt(idCliente.getText()));
            preencherTabelas();
            idCliente.setText("");
            nomeCliente.setText("");
            emailCliente.setText("");
            telefoneCliente.setText("");
            cpfCliente.setText("");
            txtEventosV.setText("Cliente removido com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerFuncionarioActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        if(tblCliente.getSelectedRow() != -1){
            idCliente.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            nomeCliente.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString());
            emailCliente.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 2).toString());
            telefoneCliente.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 3).toString());
            cpfCliente.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void alterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFuncionarioActionPerformed
        txtEventosV.setText("");
        txtEventosF.setText("");
        if(tblCliente.getSelectedRow() != -1){
            try {
                if(nomeCliente.getText().isEmpty() || emailCliente.getText().isEmpty() || telefoneCliente.getText().isEmpty() || cpfCliente.getText().isEmpty()){
                    txtEventosF.setText("Confira se não há informações faltando");
                }else{
                ClienteDAO cliente = new ClienteDAO();
                Cliente cli = new Cliente();
                
                cli.setidCliente((int)tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));
                cli.setNomeCliente(nomeCliente.getText());
                cli.setEmailCliente(emailCliente.getText());
                cli.setTelefoneCliente(telefoneCliente.getText());
                cli.setcpfCliente(cpfCliente.getText());
                
                
                cliente.editarCliente(cli);
                             
                    nomeCliente.setText("");
                    emailCliente.setText("");
                    telefoneCliente.setText("");
                    cpfCliente.setText("");
                    txtEventosV.setText("Atualização de funcionário concluída");
                    
                }
                preencherTabelas();
            } catch (SQLException ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_alterarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarFuncionario;
    private javax.swing.JButton alterarFuncionario;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JLabel idCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JButton removerFuncionario;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField telefoneCliente;
    private javax.swing.JLabel txtEventosF;
    private javax.swing.JLabel txtEventosV;
    // End of variables declaration//GEN-END:variables
}
