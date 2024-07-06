package dev.asjordi.view;

import dev.asjordi.Generator;
import dev.asjordi.utils.ClipboardUtil;
import dev.asjordi.utils.FileUtil;
import dev.asjordi.utils.ImageUtil;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        initValues();
    }
    
    private void initValues() {
        this.setIconImage(ImageUtil.getIcon().getImage());
        rbPassword.setSelected(true);
        tabbedPane.setSelectedIndex(0);
        lblMinLength.setText(String.valueOf(Generator.MIN_LENGTH_PASSWORD));
        checkLower.setSelected(true);
        String str = getNewPassword();
        txtPassword.setText(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOptions = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCopy = new javax.swing.JButton();
        btnGenerateNewPassword = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnHistory = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbPassword = new javax.swing.JRadioButton();
        rbPassphrase = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelPassword = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkUpper = new javax.swing.JCheckBox();
        jsLength = new javax.swing.JSpinner();
        checkLower = new javax.swing.JCheckBox();
        checkNumbers = new javax.swing.JCheckBox();
        checkSymbols = new javax.swing.JCheckBox();
        jsMinNum = new javax.swing.JSpinner();
        jsMinSymbols = new javax.swing.JSpinner();
        lblMinLength = new javax.swing.JLabel();
        panelPassphrase = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkUpperPassphrase = new javax.swing.JCheckBox();
        jsLengthPassphrase = new javax.swing.JSpinner();
        txtSeparatorPassphrase = new javax.swing.JTextField();
        checkNumberPassphrase = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generate Password");
        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password Generator");

        javax.swing.GroupLayout panelTitleLayout = new javax.swing.GroupLayout(panelTitle);
        panelTitle.setLayout(panelTitleLayout);
        panelTitleLayout.setHorizontalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTitleLayout.setVerticalGroup(
            panelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copy-24.png"))); // NOI18N
        btnCopy.setToolTipText("Copy password");
        btnCopy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnGenerateNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh-24.png"))); // NOI18N
        btnGenerateNewPassword.setToolTipText("New password");
        btnGenerateNewPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateNewPasswordActionPerformed(evt);
            }
        });

        txtPassword.setEditable(false);
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setToolTipText("Generated Password");

        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history-24.png"))); // NOI18N
        btnHistory.setToolTipText("Password history");
        btnHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnCopy)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerateNewPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistory)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCopy)
                    .addComponent(btnGenerateNewPassword)
                    .addComponent(btnHistory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Password type"));

        bgOptions.add(rbPassword);
        rbPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbPassword.setText("Password");
        rbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPasswordActionPerformed(evt);
            }
        });

        bgOptions.add(rbPassphrase);
        rbPassphrase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbPassphrase.setText("Passphrase");
        rbPassphrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPassphraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPassword)
                    .addComponent(rbPassphrase))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPassphrase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Longitud:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Longitud mínima:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("A-Z");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("a-z");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("0-9");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("!@#$%^&*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mínimo números:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mínimo caracteres:");

        jsLength.setModel(new javax.swing.SpinnerNumberModel(8, 8, 128, 1));

        checkNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNumbersActionPerformed(evt);
            }
        });

        checkSymbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSymbolsActionPerformed(evt);
            }
        });

        jsMinNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 128, 1));
        jsMinNum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsMinNumStateChanged(evt);
            }
        });

        jsMinSymbols.setModel(new javax.swing.SpinnerNumberModel(0, 0, 128, 1));
        jsMinSymbols.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsMinSymbolsStateChanged(evt);
            }
        });

        lblMinLength.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMinLength.setText("0");

        javax.swing.GroupLayout panelPasswordLayout = new javax.swing.GroupLayout(panelPassword);
        panelPassword.setLayout(panelPasswordLayout);
        panelPasswordLayout.setHorizontalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(checkSymbols)
                        .addComponent(checkNumbers)
                        .addComponent(checkLower)
                        .addComponent(checkUpper)
                        .addComponent(jsLength, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addComponent(jsMinNum, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addComponent(jsMinSymbols, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMinLength))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        panelPasswordLayout.setVerticalGroup(
            panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPasswordLayout.createSequentialGroup()
                        .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPasswordLayout.createSequentialGroup()
                                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelPasswordLayout.createSequentialGroup()
                                        .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelPasswordLayout.createSequentialGroup()
                                                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jsLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(lblMinLength))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4))
                                            .addComponent(checkUpper))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addComponent(checkLower))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(checkNumbers))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(checkSymbols))
                .addGap(20, 20, 20)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jsMinNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jsMinSymbols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabbedPane.addTab("", panelPassword);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Número Palabras:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Separador:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Capitalizar:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Incluir número:");

        jsLengthPassphrase.setModel(new javax.swing.SpinnerNumberModel(3, 3, 20, 1));

        txtSeparatorPassphrase.setText("-");

        javax.swing.GroupLayout panelPassphraseLayout = new javax.swing.GroupLayout(panelPassphrase);
        panelPassphrase.setLayout(panelPassphraseLayout);
        panelPassphraseLayout.setHorizontalGroup(
            panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassphraseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkNumberPassphrase)
                    .addComponent(checkUpperPassphrase)
                    .addComponent(txtSeparatorPassphrase)
                    .addComponent(jsLengthPassphrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panelPassphraseLayout.setVerticalGroup(
            panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassphraseLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelPassphraseLayout.createSequentialGroup()
                            .addGroup(panelPassphraseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelPassphraseLayout.createSequentialGroup()
                                    .addComponent(jsLengthPassphrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSeparatorPassphrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38))
                                .addComponent(checkUpperPassphrase))
                            .addGap(38, 38, 38))
                        .addComponent(checkNumberPassphrase))
                    .addGroup(panelPassphraseLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        tabbedPane.addTab("", panelPassphrase);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        String content = txtPassword.getText();
        ClipboardUtil.copyToClipboard(content);
        FileUtil.writePassword(content);
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnGenerateNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateNewPasswordActionPerformed
        txtPassword.setText(getNewPassword());
    }//GEN-LAST:event_btnGenerateNewPasswordActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        HistoryFrame h = new HistoryFrame();
        h.setLocationRelativeTo(null);
        h.setVisible(true);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void rbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPasswordActionPerformed
        tabbedPane.setSelectedIndex(0);
        String str = getNewPassword();
        txtPassword.setText(str);
    }//GEN-LAST:event_rbPasswordActionPerformed

    private void rbPassphraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPassphraseActionPerformed
       tabbedPane.setSelectedIndex(1);
       String str = getNewPassword();
       txtPassword.setText(str);
    }//GEN-LAST:event_rbPassphraseActionPerformed

    private void jsMinNumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsMinNumStateChanged
        if ((int) jsMinNum.getValue() > 0) checkNumbers.setSelected(true);
        else checkNumbers.setSelected(false);
    }//GEN-LAST:event_jsMinNumStateChanged

    private void jsMinSymbolsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsMinSymbolsStateChanged
        if ((int) jsMinSymbols.getValue() > 0) checkSymbols.setSelected(true);
        else checkSymbols.setSelected(false);
    }//GEN-LAST:event_jsMinSymbolsStateChanged

    private void checkNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNumbersActionPerformed
        if (checkNumbers.isSelected()) jsMinNum.setValue(1);
        else jsMinNum.setValue(0);
    }//GEN-LAST:event_checkNumbersActionPerformed

    private void checkSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSymbolsActionPerformed
        if (checkSymbols.isSelected()) jsMinSymbols.setValue(1);
        else jsMinSymbols.setValue(0);
    }//GEN-LAST:event_checkSymbolsActionPerformed

    private String getNewPassword() {
        
        String password = "";
        
        if (rbPassword.isSelected()) {
            int length = (int) jsLength.getValue();
            boolean uppercase = checkUpper.isSelected();
            boolean lowercase = checkLower.isSelected();
            boolean numbers = checkNumbers.isSelected();
            boolean symbols = checkSymbols.isSelected();
            int totalNumbers = 0;
            int totalSymbols = 0;

            if (numbers) totalNumbers = (int) jsMinNum.getValue();
            if (symbols) totalSymbols = (int) jsMinSymbols.getValue();

            if (uppercase == false && lowercase == false && numbers == false && symbols == false) {
                lowercase = true;
                checkLower.setSelected(true);
            }

            password = Generator.generatePassword(length, uppercase, lowercase, numbers, symbols, totalNumbers, totalSymbols);
        
        } else if (rbPassphrase.isSelected()) {
            int length = (int) jsLengthPassphrase.getValue();
            String separator = txtSeparatorPassphrase.getText();
            boolean capitalize = checkUpperPassphrase.isSelected();
            boolean includeNumber = checkNumberPassphrase.isSelected();
            
            password = Generator.generatePassphrase(length, separator, capitalize, includeNumber);
        }
        
        return password;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOptions;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGenerateNewPassword;
    private javax.swing.JButton btnHistory;
    private javax.swing.JCheckBox checkLower;
    private javax.swing.JCheckBox checkNumberPassphrase;
    private javax.swing.JCheckBox checkNumbers;
    private javax.swing.JCheckBox checkSymbols;
    private javax.swing.JCheckBox checkUpper;
    private javax.swing.JCheckBox checkUpperPassphrase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSpinner jsLength;
    private javax.swing.JSpinner jsLengthPassphrase;
    private javax.swing.JSpinner jsMinNum;
    private javax.swing.JSpinner jsMinSymbols;
    private javax.swing.JLabel lblMinLength;
    private javax.swing.JPanel panelPassphrase;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JRadioButton rbPassphrase;
    private javax.swing.JRadioButton rbPassword;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSeparatorPassphrase;
    // End of variables declaration//GEN-END:variables
}
