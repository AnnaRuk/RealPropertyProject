import java.util.Comparator;

public class ComparatorRealPropertyByTax implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.calculatePropertyTax(),o2.calculatePropertyTax());
    }
}
