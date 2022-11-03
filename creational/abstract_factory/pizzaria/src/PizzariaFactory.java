public class PizzariaFactory {
    public void makePizza(String data) {
        Pizzaolo pizzaolo;
        if ((pizzaolo = new PizzaoloCalabresa()).isWork(data)) {
            System.out.println(pizzaolo.makePizza().getIngredientes());
        } else if ((pizzaolo = new PizzaoloPresunto()).isWork(data)) {
            System.out.println(pizzaolo.makePizza().getIngredientes());
        } else {
            System.out.println("Pizzaria está fechada");
        }
    }
}
