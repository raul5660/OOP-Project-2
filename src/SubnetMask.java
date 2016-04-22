/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
class SubnetMask extends IP {
    // Attributes
    private int netmaskNumeric;
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    SubnetMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);

        Integer[] netMask = {this.getQuadOne(), this.getQuadTwo(), this.getQuadThree(), this.getQuadFour()};
        int i = 24;
        netmaskNumeric = 0;

        for(Integer quad : netMask) {
            netmaskNumeric += quad << i;
            i -= 8;
        }

        boolean encounteredOne = false;
        int ourMaskBitPattern = 1;

        for (i = 0; i < 32; i++) {
            if ((netmaskNumeric & ourMaskBitPattern) != 0) {
                encounteredOne = true; // the bit is 1
            } else { // the bit is 0
                if (encounteredOne)
                    throw new InvalidSubnetException("Invalid netmask: " + this.toString() + " (bit " + (i + 1) + ")");
            }
            ourMaskBitPattern = ourMaskBitPattern << 1;
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadOne(int quadOne) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadOne < 255) {
            throw new InvalidSubnetException("The first byte of netmask can not be less than 255");
        }else {
            if (quadOne != (quadOne & 0xff)) {
                throw new InvalidSubnetException("Invalid netmask address");
            } else {
                super.setQuadOne(quadOne);
            }
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadTwo(int quadTwo) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadTwo != (quadTwo & 0xff)) {
            throw new InvalidSubnetException("Invalid netmask address");
        } else {
            super.setQuadTwo(quadTwo);
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadThree(int quadThree) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadThree != (quadThree & 0xff)) {
            throw new InvalidSubnetException("Invalid netmask address");
        } else {
            super.setQuadThree(quadThree);
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadFour(int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadFour != (quadFour & 0xff)) {
            throw new InvalidSubnetException("Invalid netmask address");
        } else {
            super.setQuadFour(quadFour);
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    WildCardMask SubnetMaskToWildcardMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new WildCardMask(
                Integer.parseInt(invertBits(toBits(this.getQuadOne())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadTwo())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadThree())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadFour())),2));
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
    int getNetmaskNumeric() {
        return this.netmaskNumeric;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    String ClassType() {
        if (this.getQuadOne() == 255 && this.getQuadTwo() == 255 && this.getQuadThree() == 255)
        {
            return "C";
        } else if (this.getQuadOne() == 255 && this.getQuadTwo() == 255)
        {
            return "B";
        } else if (this.getQuadOne() == 255)
        {
            return "A";
        }
        return "";
    }
}
