/*
 * Name:GUI
 * Type:class
 * Arguments:GUI, CalculateActionPerformed, initComponents, 
 * Description:creates and formats a JFrame to display the IP information
 */
class GUI extends javax.swing.JFrame {
    /*
     * Name:GUI
     * Type:constructor
     * Arguments:
     * Description:Sets all of the jframe components to an initial value
     */
    GUI() {
        initComponents();
        IpAddressQuadOne.setText("192");
        IpAddressQuadTwo.setText("168");
        IpAddressQuadThree.setText("1");
        IpAddressQuadFour.setText("0");
        SubnetMaskQuadOne.setText("255");
        SubnetMaskQuadTwo.setText("255");
        SubnetMaskQuadThree.setText("255");
        SubnetMaskQuadFour.setText("0");
        NetRange = "0.0.0.0 - 0.0.0.0";
    }
    /*
     * Name:CalculateActionPerformed
     * Type:member function
     * Arguments:
     * Description:sets IP/WildcardMask/SubnetMask objects to the contents of the quads
     */
    private void CalculateActionPerformed(){
        int ipAddressQuadOne,
                ipAddressQuadTwo,
                ipAddressQuadThree,
                ipAddressQuadFour,
                wildcardQuadOne,
                wildcardQuadTwo,
                wildcardQuadThree,
                wildcardQuadFour,
                subnetMaskQuadOne,
                subnetMaskQuadTwo,
                subnetMaskQuadThree,
                subnetMaskQuadFour;
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
                ipAddress = new IpAddress(ipAddressQuadOne, ipAddressQuadTwo, ipAddressQuadThree, ipAddressQuadFour);
                subnetMask = new SubnetMask(subnetMaskQuadOne, subnetMaskQuadTwo, subnetMaskQuadThree, subnetMaskQuadFour);
                wildCardMask = new WildCardMask(wildcardQuadOne, wildcardQuadTwo, wildcardQuadThree, wildcardQuadFour);
            } catch (Exception ignored) { }

        } catch (NumberFormatException e) {
            new ErrorGui("Error " + e.getMessage()).setVisible(true);
        }
    }
    /*
     * Name:initComponents
     * Type:member function
     * Arguments:
     * Description:initializes frame components and formats GUI
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JLabel ipLabel = new javax.swing.JLabel();
        javax.swing.JLabel subnetLabel = new javax.swing.JLabel();
        javax.swing.JLabel wildcardLabel = new javax.swing.JLabel();
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
        javax.swing.JLabel quadOneLabel = new javax.swing.JLabel();
        javax.swing.JLabel quadTwoLabel = new javax.swing.JLabel();
        javax.swing.JLabel quadThreeLabel = new javax.swing.JLabel();
        javax.swing.JLabel quadFourLabel = new javax.swing.JLabel();
        javax.swing.JButton calculate = new javax.swing.JButton();
        javax.swing.JLabel networkRangeLabel = new javax.swing.JLabel();
        javax.swing.JLabel networkClassLabel = new javax.swing.JLabel();
        javax.swing.JLabel subnetIDLabel = new javax.swing.JLabel();
        javax.swing.JLabel broadcastLabel = new javax.swing.JLabel();
        NetworkRangeOutputLabel = new javax.swing.JLabel();
        NetworkClassOutputLabel = new javax.swing.JLabel();
        SubnetIDOutputLabel = new javax.swing.JLabel();
        BroadcastOutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ipLabel.setText("Ip Address: ");

        subnetLabel.setText("Subnet Mask: ");

        wildcardLabel.setText("Wildcard Mask: ");

        IpAddressQuadOne.setMinimumSize(new java.awt.Dimension(80, 28));

        quadOneLabel.setText("Quad One");

        quadTwoLabel.setText("Quad Two");

        quadThreeLabel.setText("Quad Three");

        quadFourLabel.setText("Quad Four");

        calculate.setText("Calculate");
        calculate.addActionListener(evt -> {

            if ((SubnetMaskQuadOne.getText().equals("") && SubnetMaskQuadTwo.getText().equals("") && SubnetMaskQuadThree.getText().equals("") && SubnetMaskQuadFour.getText().equals(""))
                    && (!WildcardMaskQuadOne.getText().equals("") && !WildcardMaskQuadTwo.getText().equals("") && !WildcardMaskQuadThree.getText().equals("") && !WildcardMaskQuadFour.getText().equals(""))){
                try {
                    int wildcardQuadOne, wildcardQuadTwo, wildcardQuadThree, wildcardQuadFour;
                    wildcardQuadOne     = Integer.parseInt(WildcardMaskQuadOne.getText());
                    wildcardQuadTwo     = Integer.parseInt(WildcardMaskQuadTwo.getText());
                    wildcardQuadThree   = Integer.parseInt(WildcardMaskQuadThree.getText());
                    wildcardQuadFour    = Integer.parseInt(WildcardMaskQuadFour.getText());
                    wildCardMask = new WildCardMask(wildcardQuadOne, wildcardQuadTwo, wildcardQuadThree, wildcardQuadFour);
                    subnetMask = wildCardMask.WildcardMaskToSubnetMask();
                    SubnetMaskQuadOne.setText(Integer.toString(subnetMask.getQuadOne()));
                    SubnetMaskQuadTwo.setText(Integer.toString(subnetMask.getQuadTwo()));
                    SubnetMaskQuadThree.setText(Integer.toString(subnetMask.getQuadThree()));
                    SubnetMaskQuadFour.setText(Integer.toString(subnetMask.getQuadFour()));
                } catch (Exception ignored) { }
            }
            else if ((!SubnetMaskQuadOne.getText().equals("") && !SubnetMaskQuadTwo.getText().equals("") && !SubnetMaskQuadThree.getText().equals("") && !SubnetMaskQuadFour.getText().equals(""))
                    && (WildcardMaskQuadOne.getText().equals("") && WildcardMaskQuadTwo.getText().equals("") && WildcardMaskQuadThree.getText().equals("") && WildcardMaskQuadFour.getText().equals(""))){
                try {
                    int subnetMaskQuadOne, subnetMaskQuadTwo, subnetMaskQuadThree, subnetMaskQuadFour;
                    subnetMaskQuadOne   = Integer.parseInt(SubnetMaskQuadOne.getText());
                    subnetMaskQuadTwo   = Integer.parseInt(SubnetMaskQuadTwo.getText());
                    subnetMaskQuadThree = Integer.parseInt(SubnetMaskQuadThree.getText());
                    subnetMaskQuadFour  = Integer.parseInt(SubnetMaskQuadFour.getText());
                    subnetMask = new SubnetMask(subnetMaskQuadOne, subnetMaskQuadTwo, subnetMaskQuadThree, subnetMaskQuadFour);
                    wildCardMask = subnetMask.SubnetMaskToWildcardMask();
                    WildcardMaskQuadOne.setText(Integer.toString(wildCardMask.getQuadOne()));
                    WildcardMaskQuadTwo.setText(Integer.toString(wildCardMask.getQuadTwo()));
                    WildcardMaskQuadThree.setText(Integer.toString(wildCardMask.getQuadThree()));
                    WildcardMaskQuadFour.setText(Integer.toString(wildCardMask.getQuadFour()));
                } catch (Exception ignored) { }
            }


            CalculateActionPerformed();
            NetworkClassOutputLabel.setText(subnetMask.ClassType());
            try {
                NetworkRangeOutputLabel.setText(ipAddress.NetworkRange(subnetMask));
                SubnetIDOutputLabel.setText(ipAddress.NetworkID(subnetMask));
                BroadcastOutputLabel.setText(ipAddress.BroadcastAddress(subnetMask));
            } catch (Exception ignored)
            {

            }
        });

        networkRangeLabel.setText("Network Range:");

        networkClassLabel.setText("Network Class:");

        subnetIDLabel.setText("Network ID:");

        broadcastLabel.setText("Broadcast Address:");

        NetworkRangeOutputLabel.setText(NetRange);

        NetworkClassOutputLabel.setText("A, B, C");

        SubnetIDOutputLabel.setText("0.0.0.0");

        BroadcastOutputLabel.setText("0.0.0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(subnetLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(ipLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(wildcardLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                                        .addComponent(quadOneLabel)
                                                                        .addComponent(SubnetMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(WildcardMaskQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(IpAddressQuadOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                                        .addComponent(quadTwoLabel)
                                                                        .addComponent(IpAddressQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(SubnetMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(WildcardMaskQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                                        .addComponent(IpAddressQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(quadThreeLabel)
                                                                        .addComponent(SubnetMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(WildcardMaskQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(16, 16, 16)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                                        .addComponent(quadFourLabel)
                                                                        .addComponent(IpAddressQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(SubnetMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(WildcardMaskQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(broadcastLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(networkRangeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(networkClassLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(subnetIDLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(NetworkRangeOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(NetworkClassOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(SubnetIDOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(BroadcastOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quadOneLabel)
                                        .addComponent(quadTwoLabel)
                                        .addComponent(quadThreeLabel)
                                        .addComponent(quadFourLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ipLabel)
                                        .addComponent(IpAddressQuadOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IpAddressQuadFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(subnetLabel)
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
                                        .addComponent(wildcardLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(networkRangeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(networkClassLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(subnetIDLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(broadcastLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(NetworkRangeOutputLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NetworkClassOutputLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SubnetIDOutputLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BroadcastOutputLabel)))
                                .addContainerGap(169, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private final String NetRange; //Used to accurately pass the network range between functions
    private IpAddress ipAddress;
    private SubnetMask subnetMask;
    private WildCardMask wildCardMask;
    private javax.swing.JLabel BroadcastOutputLabel;
    private javax.swing.JTextField IpAddressQuadFour;
    private javax.swing.JTextField IpAddressQuadOne;
    private javax.swing.JTextField IpAddressQuadThree;
    private javax.swing.JTextField IpAddressQuadTwo;
    private javax.swing.JLabel NetworkClassOutputLabel;
    private javax.swing.JLabel NetworkRangeOutputLabel;
    private javax.swing.JLabel SubnetIDOutputLabel;
    private javax.swing.JTextField SubnetMaskQuadTwo;
    private javax.swing.JTextField SubnetMaskQuadFour;
    private javax.swing.JTextField SubnetMaskQuadOne;
    private javax.swing.JTextField SubnetMaskQuadThree;
    private javax.swing.JTextField WildcardMaskQuadFour;
    private javax.swing.JTextField WildcardMaskQuadOne;
    private javax.swing.JTextField WildcardMaskQuadThree;
    private javax.swing.JTextField WildcardMaskQuadTwo;
    // End of variables declaration
}




