import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private final List<String> ingredientes = new ArrayList<>();

    public Pizza(String... ingredientes) {
        Collections.addAll(this.ingredientes, ingredientes);
    }

    public List<String> getIngredientes() {
        return this.ingredientes;
    }
}
