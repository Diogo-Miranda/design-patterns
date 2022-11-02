import java.util.ArrayList;
import java.util.List;

public class AdderAdapter implements Adder {
    private final AdderAvailable adderAvailable;

    public AdderAdapter(AdderAvailable adderAvailable) {
        this.adderAvailable = adderAvailable;
    }
    @Override
    public int sumVector(int[] vector) {
        List<Integer> list = new ArrayList<>(vector.length);
        for (int i : vector)
            list.add(i);
        return adderAvailable.sumList(list);
    }
}
