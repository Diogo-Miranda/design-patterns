import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PizzaoloPresunto implements Pizzaolo{
    private final Pizza pizza;
    private final List<DayOfWeek> work;

    public PizzaoloPresunto() {
        this.pizza = new Pizza("queijo", "presunto", "tomate");
        this.work = List.of(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY);
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
