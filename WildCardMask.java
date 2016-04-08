/**
 * Created by raulmartinez on 4/4/16.
 */
public class WildCardMask extends IP {

    public WildCardMask() { }

    public WildCardMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }

    public SubnetMask WildcardMaskToSubnetMask() throws IpException, InvalidSubnetException {
        return new SubnetMask(
                255+this.getQuadOne(),
                255+this.getQuadTwo(),
                255+this.getQuadThree(),
                255+this.getQuadFour());
    }

    @Override
    public String toString() {
        return String.format(
                "Wildcard Mask: %d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
}

