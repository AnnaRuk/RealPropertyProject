import java.util.Comparator;

public class ComparatorRealPropertyByPrice implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
