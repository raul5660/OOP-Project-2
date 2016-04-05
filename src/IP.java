/**
 * Created by raulmartinez on 4/4/16.
 */
public abstract class IP {
    protected int quadOne,quadTwo,quadThree,quadFour;

    public IP() { }

    public IP(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException {
        this.setQuadOne(quadOne);
        this.setQuadTwo(quadTwo);
        this.setQuadThree(quadThree);
        this.setQuadFour(quadFour);
    }

    public int getQuadOne() {
        return quadOne;
    }

    public void setQuadOne(int quadOne) throws IpException {
        if (quadOne > 255 || quadOne < 0){
            throw new IpException("Quad one exceeds limit");
        } else {
            this.quadOne = quadOne;
        }
    }

    public int getQuadTwo() {
        return quadTwo;
    }

    public void setQuadTwo(int quadTwo) throws IpException {
        if (quadTwo > 255 || quadTwo < 0){
            throw new IpException("Quad two exceeds limit");
        } else {
            this.quadTwo = quadTwo;
        }
    }

    public int getQuadThree() {
        return quadThree;
    }

    public void setQuadThree(int quadThree) throws IpException {
        if (quadThree > 255 || quadThree < 0){
            throw new IpException("Quad three exceeds limit");
        } else {
            this.quadThree = quadThree;
        }
    }

    public int getQuadFour() {
        return quadFour;
    }

    public void setQuadFour(int quadFour) throws IpException {
        if (quadFour > 255 || quadFour < 0){
            throw new IpException("Quad four exceeds limit");
        } else {
            this.quadFour = quadFour;
        }
    }

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
