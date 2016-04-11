/**
 * Created by raulmartinez on 4/4/16.
 */
public class GUI extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        int ipAddressQuadOne,
            ipAddressQuadTwo,
            ipAddressQuadThree,
            ipAddressQuadFour,
            subnetMaskQuadOne,
            subnetMaskQuadTwo,
            subnetMaskQuadThree,
            subnetMaskQuadFour,
            wildcardQuadOne,
            wildcardQuadTwo,
            wildcardQuadThree,
            wildcardQuadFour;
        try {

            ipAddressQuadOne    = Integer.parseInt(IpAddressQuadOne.getText());
            ipAddressQuadTwo    = Integer.parseInt(IpAddressQuadTwo.getText());
            ipAddressQuadThree  = Integer.parseInt(IpAddressQuadThree.getText());
            ipAddressQuadFour   = Integer.parseInt(IpAddressQuadFour.getText());
            subnetMaskQuadOne   = Integer.parseInt(SubnetMaskQuadOne.getText());
            subnetMaskQuadTwo   = Integer.parseInt(SubnetMaskQuadTwo.getText());
            subnetMaskQuadThree = Integer.parseInt(SubnetMaskQuadThree.getText());
            subnetMaskQuadFour  = Integer.parseInt(SubnetMaskQuadFour.getText());
            wildcardQuadOne     = Integer.parseInt(WildcardMaskQuadOne.getText());
            wildcardQuadTwo     = Integer.parseInt(WildcardMaskQuadTwo.getText());
            wildcardQuadThree   = Integer.parseInt(WildcardMaskQuadThree.getText());
            wildcardQuadFour    = Integer.parseInt(WildcardMaskQuadFour.getText());


            try {
                IpAddress ipAddress = new IpAddress(ipAddressQuadOne, ipAddressQuadTwo, ipAddressQuadThree, ipAddressQuadFour);
                SubnetMask subnetMask = new SubnetMask(subnetMaskQuadOne, subnetMaskQuadTwo, subnetMaskQuadThree, subnetMaskQuadFour);
                WildCardMask wildCardMask = new WildCardMask(subnetMaskQuadOne, subnetMaskQuadTwo, subnetMaskQuadThree, subnetMaskQuadFour);
            } catch (Exception e) { }

        } catch (NumberFormatException e) {
            new ErrorGui("Error " + e.getMessage()).setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        IpLabel = new javax.swing.JLabel();
        SubnetLabel = new javax.swing.JLabel();
        WildcardLabel = new javax.swing.JLabel();
        WildcardMaskQuadOne = new javax.swing.JTextField();
        WildcardMaskQuadTwo = new javax.swing.JTextField();
        WildcardMaskQuadThree = new javax.swing.JTextField();
        WildcardMaskQuadFour = new javax.swing.JTextField();
        SubnetMaskQuadFour = new javax.swing.JTextField();
        SubnetMaskQuadThree = new javax.swing.JTextField();
        SubnetMaskQuadTwo = new javax.swing.JTextField();
        SubnetMaskQuadOne = new javax.swing.JTextField();
        IpAddressQuadFour = new javax.swing.JTextField();
        IpAddressQuadThree = new javax.swing.JTextField();
        IpAddressQuadTwo = new javax.swing.JTextField();
        IpAddressQuadOne = new javax.swing.JTextField();
        QuadOneLabel = new javax.swing.JLabel();
        QuadTwoLabel = new javax.swing.JLabel();
        QuadThreeLabel = new javax.swing.JLabel();
        QuadFourLabel = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IpLabel.setText("Ip Address: ");

        SubnetLabel.setText("Subnet Mask: ");

        WildcardLabel.setText("Wildcard Mask: ");

        IpAddressQuadOne.setMinimumSize(new java.awt.Dimension(80, 28));

        QuadOneLabel.setText("Quad One");

        QuadTwoLabel.setText("Quad Two");

        QuadThreeLabel.setText("Quad Three");

        QuadFourLabel.setText("Quad Four");

        Calculate.setText("Calculate");

        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(SubnetLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(IpLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(WildcardLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(QuadOneLabel)
                                                        .addComponent(SubnetMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(WildcardMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(IpAddressQuadOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(QuadTwoLabel)
                                                        .addComponent(IpAddressQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SubnetMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(WildcardMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(IpAddressQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(QuadThreeLabel)
                                                        .addComponent(SubnetMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(WildcardMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                        .addComponent(QuadFourLabel)
                                                        .addComponent(IpAddressQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(SubnetMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(WildcardMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(QuadOneLabel)
                                        .addComponent(QuadTwoLabel)
                                        .addComponent(QuadThreeLabel)
                                        .addComponent(QuadFourLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IpLabel)
                                        .addComponent(IpAddressQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SubnetLabel)
                                        .addComponent(SubnetMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubnetMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubnetMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SubnetMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(WildcardMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WildcardMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WildcardMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WildcardMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WildcardLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Calculate)
                                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JTextField IpAddressQuadFour;
    private javax.swing.JTextField IpAddressQuadOne;
    private javax.swing.JTextField IpAddressQuadThree;
    private javax.swing.JTextField IpAddressQuadTwo;
    private javax.swing.JTextField SubnetMaskQuadTwo;
    private javax.swing.JTextField SubnetMaskQuadFour;
    private javax.swing.JTextField SubnetMaskQuadOne;
    private javax.swing.JTextField SubnetMaskQuadThree;
    private javax.swing.JTextField WildcardMaskQuadFour;
    private javax.swing.JTextField WildcardMaskQuadOne;
    private javax.swing.JTextField WildcardMaskQuadThree;
    private javax.swing.JTextField WildcardMaskQuadTwo;
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel IpLabel;
    private javax.swing.JLabel SubnetLabel;
    private javax.swing.JLabel WildcardLabel;
    private javax.swing.JLabel QuadOneLabel;
    private javax.swing.JLabel QuadTwoLabel;
    private javax.swing.JLabel QuadThreeLabel;
    private javax.swing.JLabel QuadFourLabel;
    // End of variables declaration
}
