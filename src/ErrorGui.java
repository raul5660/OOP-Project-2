/*
 * Name:ErrorGui
 * Type:Class
 * Arguments:ErrorGui(), OkButtonActionPerformed, InitComponents,
 * Description:Displays error message in another frame
 */
class ErrorGui extends javax.swing.JFrame {
    /*
     * Name:ErrorGui
     * Type:constructor
     * Arguments:Error: String
     * Description:calls initComponents member function and sets jTextArea to error
     */
    ErrorGui(String Error) {
        initComponents();
        jTextArea1.setText(Error);
    }
    /*
     * Name:OkActionButtonPerformed
     * Type:member function
     * Arguments:evt: ActionEvent
     * Description:turns off frame visibility
     */
    private void OkButtonActionPerformed() {
        this.setVisible(false);
    }
    /*
     * Name:initComponents
     * Type:member function
     * Arguments:
     * Description:sets frame components and formats the frame, then packs it all
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        javax.swing.JButton okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        okButton.setText("OK");
        okButton.addActionListener(evt -> OkButtonActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okButton))
        );

        pack();
    }// </editor-fold>

    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration
}

