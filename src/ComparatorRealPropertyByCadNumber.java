import java.util.Comparator;

public class ComparatorRealPropertyByCadNumber implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return o1.getCadastralNumber().compareTo(o2.getCadastralNumber());
    }
}
