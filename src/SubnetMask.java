import java.util.Arrays;
/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
public class SubnetMask extends IP {
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public SubnetMask() { }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public SubnetMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    @Override
    public void setQuadOne(int quadOne) throws IpException, InvalidSubnetException, InvalidWildCardException {
        int[] acceptableIntegers = {255, 254, 252, 248, 240, 224, 192, 128, 0};
        if (SubnetMask.contains(acceptableIntegers,quadOne)) {
            super.setQuadOne(quadOne);
        } else {
            throw new InvalidSubnetException("Quad One must be "+Arrays.toString(acceptableIntegers));
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
        int[] acceptableIntegers = {255, 254, 252, 248, 240, 224, 192, 128, 0};
        if (SubnetMask.contains(acceptableIntegers,quadTwo)) {
            super.setQuadTwo(quadTwo);
        } else {
            throw new InvalidSubnetException("Quad Two must be "+Arrays.toString(acceptableIntegers));
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
        int[] acceptableIntegers = {255, 254, 252, 248, 240, 224, 192, 128, 0};
        if (SubnetMask.contains(acceptableIntegers,quadThree)) {
            super.setQuadThree(quadThree);
        } else {
            throw new InvalidSubnetException("Quad Three must be "+Arrays.toString(acceptableIntegers));
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
        int[] acceptableIntegers = {255, 254, 252, 248, 240, 224, 192, 128, 0};
        if (SubnetMask.contains(acceptableIntegers,quadFour)) {
            super.setQuadFour(quadFour);
        } else {
            throw new InvalidSubnetException("Quad Four must be "+Arrays.toString(acceptableIntegers));
        }
    }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public WildCardMask SubnetMaskToWildcardMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new WildCardMask(
                255-this.getQuadOne(),
                255-this.getQuadTwo(),
                255-this.getQuadThree(),
                255-this.getQuadFour());
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
                "IP Subnet Mask: %d.%d.%d.%d",
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
}
