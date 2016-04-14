/**
 * Created by raulmartinez on 4/4/16.
 */
public class IpAddress extends IP {

    public IpAddress() { }

    public IpAddress(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }

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
