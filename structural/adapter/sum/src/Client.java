public class Client {
    private final Adder adder;

    public Client(Adder adder) {
        this.adder = adder;
    }

    public void exec() {
        int[] vector = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = adder.sumVector(vector);
        System.out.println("Result: " + sum);
    }
}
