/*
 * Name:SubnetMask
 * Type:class
 * Arguments:
 * Description:stores and processes data in subnet mask quads
 */
class SubnetMask extends IP {
    // Attributes
    private int netmaskNumeric;
    /*
     * Name:SubnetMask
     * Type:constructor
     * Arguments:quadOne: int, quadTwo: int, quadThree: int, quadFour: int
     * Description:passes variables to super class
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
     * Name:setQuadOne
     * Type:member function
     * Arguments:quadOne: int
     * Description:checks to see if variable is within range, then sets it to quadOne
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
     * Name:setQuadTwo
     * Type:member function
     * Arguments:quadTwo: int
     * Description:checks to see if variable is in range, then sets it to quadTwo
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
     * Name:setQuadThree
     * Type:member function
     * Arguments:quadThree: int
     * Description:checks to see if variable is in range, then sets it to quadThree
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
     * Name:setQuadFour
     * Type:member function
     * Arguments:quadFour: int
     * Description:chacks to see if variable is in range, then sets it to quadFour
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
     * Name:SubnetMaskToWildcardMask
     * Type:member function
     * Arguments:
     * Description:converts the mask to wildcard mask
     */
    WildCardMask SubnetMaskToWildcardMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new WildCardMask(
                Integer.parseInt(invertBits(toBits(this.getQuadOne())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadTwo())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadThree())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadFour())),2));
    }
    /*
     * Name:toString
     * Type:member function
     * Arguments:
     * Description:formats quads into one string
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
     * Name:getNetmasKNumeric
     * Type:member function
     * Arguments:
     * Description:returns the numeric net mask
     */
    int getNetmaskNumeric() {
        return this.netmaskNumeric;
    }
    /*
     * Name:ClassType
     * Type:member function
     * Arguments:
     * Description:returns the class of the subnet mask
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
