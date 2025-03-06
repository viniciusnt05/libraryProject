/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;
import Models.Livro;
import Controllers.LivroController;
import Models.Usuario;
import javax.swing.JOptionPane;

public class telaAtualizarLivro extends javax.swing.JFrame {
    private final int livroId;
    private final Usuario usuarioAdmin;
    private final telaExibirLivrosAdmin telaAnterior;

    public telaAtualizarLivro(int idLivro, Usuario admin, telaExibirLivrosAdmin anterior) {
        this.livroId = idLivro;
        this.usuarioAdmin = admin;
        this.telaAnterior = anterior;
        initComponents();
        carregarDadosLivro();
    }

    private void carregarDadosLivro() {
        Livro livro = LivroController.buscarLivroPorId(livroId);
        if (livro != null) {
            txtFieldTitulo.setText(livro.getTitulo());
            txtFieldAutor.setText(livro.getAutor());
            txtFieldValor.setText(String.valueOf(livro.getValor()));
            checkBoxDisponivel.setSelected(livro.isDisponivel());
        } else {
            JOptionPane.showMessageDialog(this, "Livro não encontrado.");
            dispose();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldValor = new javax.swing.JTextField();
        checkBoxDisponivel = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alugar Livros");
        setPreferredSize(new java.awt.Dimension(590, 310));

        txtFieldAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAutorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualize o Livro");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAtualizar.setBackground(new java.awt.Color(84, 203, 103));
        btnAtualizar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setName(""); // NOI18N
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Título");

        btnVoltar.setBackground(new java.awt.Color(245, 214, 103));
        btnVoltar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setInheritsPopupMenu(true);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Autor");

        txtFieldTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTituloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Valor");

        txtFieldValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldValorActionPerformed(evt);
            }
        });

        checkBoxDisponivel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkBoxDisponivel.setText("Disponível");
        checkBoxDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxDisponivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxDisponivel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(checkBoxDisponivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAutorActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String titulo = txtFieldTitulo.getText();
        String autor = txtFieldAutor.getText();
        double valor;

        try {
            valor = Double.parseDouble(txtFieldValor.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor válido.");
            return;
        }

        boolean disponivel = checkBoxDisponivel.isSelected();

        LivroController.atualizarLivro(livroId, titulo, autor, valor, disponivel);
        JOptionPane.showMessageDialog(this, "Livro atualizado com sucesso!");
        
        telaAnterior.atualizarTabelaLivros();
        telaAnterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        telaAnterior.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTituloActionPerformed

    private void txtFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldValorActionPerformed

    private void checkBoxDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxDisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxDisponivelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkBoxDisponivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtFieldAutor;
    private javax.swing.JTextField txtFieldTitulo;
    private javax.swing.JTextField txtFieldValor;
    // End of variables declaration//GEN-END:variables
}
