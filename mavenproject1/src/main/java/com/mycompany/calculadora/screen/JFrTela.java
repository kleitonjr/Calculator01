/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora.screen;

/**
 *
 * @author KleitonJr
 */
public class JFrTela extends javax.swing.JFrame {

    /**
     * Creates new form JFrTela
     */
    public JFrTela() {
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

        jButton16 = new javax.swing.JButton();
        tfTela = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAC = new javax.swing.JButton();
        btnMaisMenos = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        jButton16.setText("jButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");

        tfTela.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tfTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTela.setText("0,00");

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        btnAC.setText("AC");
        jPanel1.add(btnAC);

        btnMaisMenos.setText("+/-");
        jPanel1.add(btnMaisMenos);

        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });
        jPanel1.add(btnPercent);

        btnDiv.setText("/");
        jPanel1.add(btnDiv);

        btn7.setText("7");
        jPanel1.add(btn7);

        btn8.setText("8");
        jPanel1.add(btn8);

        btn9.setText("9");
        jPanel1.add(btn9);

        btnMulti.setText("*");
        jPanel1.add(btnMulti);

        btn4.setText("4");
        jPanel1.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.setText("6");
        jPanel1.add(btn6);

        btnMenos.setText("-");
        jPanel1.add(btnMenos);

        btn1.setText("1");
        jPanel1.add(btn1);

        btn2.setText("2");
        jPanel1.add(btn2);

        btn3.setText("3");
        jPanel1.add(btn3);

        btnMais.setText("+");
        jPanel1.add(btnMais);

        btn0.setText("0");
        jPanel1.add(btn0);

        btnVirgula.setText(",");
        jPanel1.add(btnVirgula);

        btnFechar.setText("FECHAR");
        jPanel1.add(btnFechar);

        btnIgual.setText("=");
        jPanel1.add(btnIgual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(tfTela))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTela, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPercentActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMaisMenos;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton jButton16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfTela;
    // End of variables declaration//GEN-END:variables
}