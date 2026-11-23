public class Jewelry extends FixedAsset {
    double karrat;

    public Jewelry(double karrat, double marketValue, String name) {
        super(name, marketValue);
        this.karrat = karrat;
    }
    @Override
    public double getValue() {
        return marketValue;
    }
}
