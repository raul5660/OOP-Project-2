public class IpAddress extends IP {

    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public IpAddress() { }

    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public IpAddress(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
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
                "IP Address: %d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
}
