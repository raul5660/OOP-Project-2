import java.util.Arrays;

class WildCardMask extends IP {
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    WildCardMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    SubnetMask WildcardMaskToSubnetMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new SubnetMask(
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
    public void setQuadOne(int q1) throws IpException, InvalidWildCardException, InvalidSubnetException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 255};
        if (WildCardMask.has(acceptableIntegers, q1)){
            super.setQuadOne(q1);
        }
        else{
            throw new InvalidWildCardException("WildCard one must be " + Arrays.toString(acceptableIntegers));
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadTwo(int q2) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 255};
        if (WildCardMask.has(acceptableIntegers, q2)){
            super.setQuadTwo(q2);
        }
        else{
            throw new InvalidWildCardException("WildCard two must be " + Arrays.toString(acceptableIntegers));
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadThree(int q3) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 255};
        if (WildCardMask.has(acceptableIntegers, q3)){
            super.setQuadThree(q3);
        }
        else{
            throw new InvalidWildCardException("WildCard three must be " + Arrays.toString(acceptableIntegers));
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public void setQuadFour(int q4) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 255};
        if (WildCardMask.has(acceptableIntegers, q4)){
            super.setQuadFour(q4);
        }
        else{
            throw new InvalidWildCardException("WildCard four must be " + Arrays.toString(acceptableIntegers));
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    private static boolean has(int[] acceptableIntegers, int q){
        return Arrays.stream(acceptableIntegers).anyMatch(i -> i == q);
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
}

