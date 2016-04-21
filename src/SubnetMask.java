import java.util.Arrays;
/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
class SubnetMask extends IP {
    public int getNetmaskNumeric() {
        return netmaskNumeric;
    }

    private int netmaskNumeric;
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    SubnetMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
        String[] st = this.toString().split("\\.");
        if (st.length != 4)
            throw new InvalidSubnetException("Invalid netmask address: "
                    + this.toString());

        int i = 24;
        netmaskNumeric = 0;
        if (Integer.parseInt(st[0]) < 255) {
            throw new InvalidSubnetException(
                    "The first byte of netmask can not be less than 255");
        }
        for (int n = 0; n < st.length; n++) {
            int value = Integer.parseInt(st[n]);
            if (value != (value & 0xff)) {
                throw new InvalidSubnetException("Invalid netmask address: "
                        + this.toString());
            }

            netmaskNumeric += value << i;
            i -= 8;
        }
        boolean encounteredOne = false;
        int ourMaskBitPattern = 1;
        for (i = 0; i < 32; i++) {
            if ((netmaskNumeric & ourMaskBitPattern) != 0) {
                encounteredOne = true; // the bit is 1
            } else { // the bit is 0
                if (encounteredOne == true)
                    throw new NumberFormatException("Invalid netmask: "
                            + this.toString() + " (bit " + (i + 1) + ")");
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
            super.setQuadOne(quadOne);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadTwo(int quadTwo) throws IpException, InvalidSubnetException, InvalidWildCardException {
                super.setQuadTwo(quadTwo);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadThree(int quadThree) throws IpException, InvalidSubnetException, InvalidWildCardException {
                super.setQuadThree(quadThree);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadFour(int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
                super.setQuadFour(quadFour);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public WildCardMask SubnetMaskToWildcardMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
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
    private static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public String ClassType() {
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
