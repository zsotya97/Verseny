package Main;

import java.util.Comparator;

public class SortOsszeg implements Comparator<Eredmenyek>
{
    @Override
    public int compare(Eredmenyek o1, Eredmenyek o2) {
        return Double.compare(o1.getOsszesitett(), o2.getOsszesitett());
    }
}
