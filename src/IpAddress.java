class IpAddress extends IP {
    int baseIPnumeric;
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    IpAddress(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
        String[] st = this.toString().split("\\.");
        if (st.length != 4)
            throw new IpException("Invalid IP address: " + this.toString());

        int i = 24;
        baseIPnumeric = 0;
        for (int n = 0; n < st.length; n++) {
            int value = Integer.parseInt(st[n]);
            if (value != (value & 0xff)) {
                throw new IpException("Invalid IP address: "
                        + this.toString());
            }

            baseIPnumeric += value << i;
            i -= 8;
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public String toString() {
        return String.format(
                "%d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public String NetworkID(SubnetMask subnetMask){
        int numberOfBits;
        for (numberOfBits = 0; numberOfBits < 32; numberOfBits++) {
            if ((subnetMask.getNetmaskNumeric() << numberOfBits) == 0)
                break;
        }
        Integer numberOfIPs = 0;
        for (int n = 0; n < (32 - numberOfBits); n++) {
            numberOfIPs = numberOfIPs << 1;
            numberOfIPs = numberOfIPs | 0x01;
        }

        Integer baseIP = this.baseIPnumeric & subnetMask.getNetmaskNumeric();

        return convertNumericIpToSymbolic(baseIP);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public String BroadcastAddress(SubnetMask subnetMask)
    {
        int numberOfBits;
        for (numberOfBits = 0; numberOfBits < 32; numberOfBits++) {
            if ((subnetMask.getNetmaskNumeric() << numberOfBits) == 0)
                break;
        }
        Integer numberOfIPs = 0;
        for (int n = 0; n < (32 - numberOfBits); n++) {
            numberOfIPs = numberOfIPs << 1;
            numberOfIPs = numberOfIPs | 0x01;
        }

        Integer baseIP = this.baseIPnumeric & subnetMask.getNetmaskNumeric();
        return convertNumericIpToSymbolic(baseIP + numberOfIPs);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public String NetworkRange(SubnetMask subnetMask) throws IpException, InvalidSubnetException {
        int numberOfBits;
        for (numberOfBits = 0; numberOfBits < 32; numberOfBits++) {
            if ((subnetMask.getNetmaskNumeric() << numberOfBits) == 0)
                break;
        }
        Integer numberOfIPs = 0;
        for (int n = 0; n < (32 - numberOfBits); n++) {
            numberOfIPs = numberOfIPs << 1;
            numberOfIPs = numberOfIPs | 0x01;
        }

        Integer baseIP = this.baseIPnumeric & subnetMask.getNetmaskNumeric();
        String firstIP = convertNumericIpToSymbolic(baseIP + 1);
        String lastIP = convertNumericIpToSymbolic(baseIP + numberOfIPs - 1);

        return firstIP + " - " + lastIP;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    private String convertNumericIpToSymbolic(Integer ip) {
        StringBuffer sb = new StringBuffer(15);
        for (int shift = 24; shift > 0; shift -= 8) {
            // process 3 bytes, from high order byte down.
            sb.append(Integer.toString((ip >>> shift) & 0xff));
            sb.append('.');
        }
        sb.append(Integer.toString(ip & 0xff));
        return sb.toString();
    }


}
