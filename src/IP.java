/*
 * Name:IP
 * Type:class
 * Arguments:
 * Description:parent class for IpAddress/SubnetMask/WildcardMask objects. Stores and processes quad information
 */
abstract class IP {
    // Attributes
    private int quadOne,quadTwo,quadThree,quadFour;

    /*
     * Name:IP
     * Type:constructor
     * Arguments:quadOne: int, quadTwo: int, quadThree: int, quadFour: int
     * Description:sets quad variables as the variables it was initialized with
     */
    IP(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        this.setQuadOne(quadOne);
        this.setQuadTwo(quadTwo);
        this.setQuadThree(quadThree);
        this.setQuadFour(quadFour);
    }
    /*
     * Name:getQuadOne
     * Type:member function
     * Arguments:
     * Description:returns quadOne
     */
    int getQuadOne() {
        return quadOne;
    }
    /*
     * Name:setQuadOne
     * Type:member function
     * Arguments:quadOne: int
     * Description:checks if passed variable is within proper range then sets it to quad one
     */
    public void setQuadOne(int quadOne) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadOne > 255 || quadOne < 0){
            throw new IpException("Quad one exceeds limit");
        } else {
            this.quadOne = quadOne;
        }
    }
    /*
     * Name:getQuadTwo
     * Type:member function
     * Arguments:
     * Description:returns quadTwo
     */
    int getQuadTwo() {
        return quadTwo;
    }
    /*
     * Name:setQuadTwo
     * Type:member function
     * Arguments:quadTwo: int
     * Description:checks to see if passed variable is within range, then sets it to quadTwo
     */
    public void setQuadTwo(int quadTwo) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadTwo > 255 || quadTwo < 0){
            throw new IpException("Quad two exceeds limit");
        } else {
            this.quadTwo = quadTwo;
        }
    }
    /*
     * Name:getQuadThree
     * Type:member function
     * Arguments:
     * Description:returns quadThree
     */
    int getQuadThree() {
        return quadThree;
    }
    /*
     * Name:setQuadThree
     * Type:member function
     * Arguments:quadThree: int
     * Description:checks to see if passed variable on in range, then sets it to quadThree
     */
    public void setQuadThree(int quadThree) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadThree > 255 || quadThree < 0){
            throw new IpException("Quad three exceeds limit");
        } else {
            this.quadThree = quadThree;
        }
    }
    /*
     * Name:getQuadFour
     * Type:member function
     * Arguments:
     * Description:returns quadFour
     */
    int getQuadFour() {
        return quadFour;
    }
    /*
     * Name:setQuadFour
     * Type:member function
     * Arguments:
     * Description:checks to see if passed variable is in range, then sets it to quadFour
     */
    public void setQuadFour(int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadFour > 255 || quadFour < 0){
            throw new IpException("Quad four exceeds limit");
        } else {
            this.quadFour = quadFour;
        }
    }
    /*
     * Name:toString
     * Type:member function
     * Arguments:
     * Description:formats the quad data into one string
     */
    @Override
    public String toString() {
        return String.format(
                "IP: %d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
    /*
     * Name:invertBits
     * Type:member function
     * Arguments:bits: String
     * Description:reverses the bit order of a binary string
     */
    static String invertBits(String bits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char bit : bits.toCharArray()){
            switch (bit){
                case '0':
                    stringBuilder.append("1");
                    break;
                case '1':
                    stringBuilder.append("0");
                    break;
            }
        }
        return stringBuilder.toString();
    }
    /*
     * Name:toBits
     * Type:member function
     * Arguments:x: int
     * Description:returns binary string
     */
    static String toBits(int x)
    {
        return pad(Integer.toBinaryString(x));
    }
    /*
     * Name:pad
     * Type:member function
     * Arguments:nnum: String
     * Description:pads a short binary string with zeroes
     */
    private static String pad(String num) {
        char[] tmp = num.toCharArray();
        if (tmp.length < 8)
        {
            int padding = 8 - tmp.length;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(num);
            for(int i = 0; i < padding; i++) {
                stringBuilder.append("0");
            }
            return stringBuilder.toString();
        }
        return num;
    }
}


