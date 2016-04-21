
/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
abstract class IP {
    private int quadOne,quadTwo,quadThree,quadFour;

    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    IP(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        this.setQuadOne(quadOne);
        this.setQuadTwo(quadTwo);
        this.setQuadThree(quadThree);
        this.setQuadFour(quadFour);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    int getQuadOne() {
        return quadOne;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadOne(int quadOne) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadOne > 255 || quadOne < 0){
            throw new IpException("Quad one exceeds limit");
        } else {
            this.quadOne = quadOne;
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    int getQuadTwo() {
        return quadTwo;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadTwo(int quadTwo) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadTwo > 255 || quadTwo < 0){
            throw new IpException("Quad two exceeds limit");
        } else {
            this.quadTwo = quadTwo;
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    int getQuadThree() {
        return quadThree;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadThree(int quadThree) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadThree > 255 || quadThree < 0){
            throw new IpException("Quad three exceeds limit");
        } else {
            this.quadThree = quadThree;
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    int getQuadFour() {
        return quadFour;
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadFour(int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        if (quadFour > 255 || quadFour < 0){
            throw new IpException("Quad four exceeds limit");
        } else {
            this.quadFour = quadFour;
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
                "IP: %d.%d.%d.%d",
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
    public static String invertBits(String bits) {
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
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public static String toBits(int x)
    {
        return pad(Integer.toBinaryString(x));
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
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
