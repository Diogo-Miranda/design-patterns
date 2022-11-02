import java.util.List;

public class AdderAvailable {
    public int sumList(List<Integer> list) {
        int result = 0;
        for (var i : list)
            result += i;
        return result;
    }
}
