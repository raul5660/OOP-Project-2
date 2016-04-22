import java.util.Arrays;
/*
 * Name: WildCardMask
 * Type:class
 * Arguments:
 * Description:stores and processes contents of Wildcard mask quads in GUI
 */
class WildCardMask extends IP {
    /*
     * Name:WildCardMask
     * Type:constructor
     * Arguments:quadOne: int, quadTwo: int, quadThree: int, quadFour: int
     * Description:passes variables to super class
     */
    WildCardMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }
    /*
     * Name:WildcardMaskToSubnetMask
     * Type:member function
     * Arguments:
     * Description:converts the wildcard mask to a subnet mask
     */
    SubnetMask WildcardMaskToSubnetMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new SubnetMask(
                Integer.parseInt(invertBits(toBits(this.getQuadOne())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadTwo())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadThree())),2),
                Integer.parseInt(invertBits(toBits(this.getQuadFour())),2));
    }
    /*
     * Name:setQuadOne
     * Type:member function
     * Arguments:q1: int
     * Description:checks to see if q1 is valid, then sets it to quadOne
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
     * Name:setQuadTwo
     * Type:member function
     * Arguments:q2: int
     * Description:checks to see if q2 is valid, then sets it to quadTwo
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
     * Name:setQuadThree
     * Type:member function
     * Arguments:q3: int
     * Description:checks to see if q3 is valid, then sets it to quadThree
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
     * Name:setQuadFour
     * Type:member function
     * Arguments:q4: int
     * Description:checks to see if q4 is valid, then sets it to quadFour
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
     * Name:has
     * Type:member function
     * Arguments:acceptableIntegers: int[], q: int
     * Description:checks to see if q is int acceptable integers
     */
    private static boolean has(int[] acceptableIntegers, int q){
        return Arrays.stream(acceptableIntegers).anyMatch(i -> i == q);
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
}

