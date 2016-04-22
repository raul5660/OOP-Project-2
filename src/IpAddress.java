class IpAddress extends IP {
    // Attributes
    private int baseIPnumeric;
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    IpAddress(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);

        Integer[] ipAddress = {this.getQuadOne(), this.getQuadTwo(), this.getQuadThree(), this.getQuadFour()};
        int i = 24;
        baseIPnumeric = 0;

        for(Integer quad : ipAddress) {
            baseIPnumeric += quad << i;
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
    String NetworkID(SubnetMask subnetMask){
        return convertNumericIpToSymbolic(this.baseIPnumeric & subnetMask.getNetmaskNumeric());
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    String BroadcastAddress(SubnetMask subnetMask) {
        return convertNumericIpToSymbolic((this.baseIPnumeric & subnetMask.getNetmaskNumeric()) + this.NumberOfIPs(subnetMask));
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    String NetworkRange(SubnetMask subnetMask) throws IpException, InvalidSubnetException {
        Integer baseIP = this.baseIPnumeric & subnetMask.getNetmaskNumeric();
        String firstIP = convertNumericIpToSymbolic(baseIP + 1);
        String lastIP = convertNumericIpToSymbolic(baseIP + this.NumberOfIPs(subnetMask) - 1);

        return firstIP + " - " + lastIP;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    private int NumberOfIPs(SubnetMask subnetMask) {
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

        return numberOfIPs;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    private String convertNumericIpToSymbolic(Integer ip) {
        StringBuilder stringBuilder = new StringBuilder(15);
        for (int shift = 24; shift > 0; shift -= 8) {
            // process 3 bytes, from high order byte down.
            stringBuilder.append(Integer.toString((ip >>> shift) & 0xff));
            stringBuilder.append('.');
        }
        stringBuilder.append(Integer.toString(ip & 0xff));
        return stringBuilder.toString();
    }


}
