import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PizzaoloCalabresa implements Pizzaolo {
    private final Pizza pizza;
    private final List<DayOfWeek> work;

    public PizzaoloCalabresa() {
        this.pizza = new Pizza("queijo", "calabresa", "tomate");
        this.work = List.of(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY);
    }

    @Override
    public Pizza makePizza() {
        return pizza;
    }

    @Override
    public boolean isWork(String data) {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var dayOfWeek = LocalDate.parse(data, formatter).getDayOfWeek();
        return work.stream().anyMatch(d -> d.getValue() == dayOfWeek.getValue());
    }
}
