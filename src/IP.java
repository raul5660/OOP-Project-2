
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
}
