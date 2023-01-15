package second;

public class Pair <F,S>{
    private F firstType;
    private S secondType;

    public F getFirstType() {
        return firstType;
    }

    public void setFirstType(F firstType) {
        this.firstType = firstType;
    }

    public S getSecondType() {
        return secondType;
    }

    public void setSecondType(S secondType) {
        this.secondType = secondType;
    }
}
