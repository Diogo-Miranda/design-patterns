public class SumMain {
    public static void main(String[] args) {
        AdderAvailable adderAvailable = new AdderAvailable();
        Client client = new Client(new AdderAdapter(adderAvailable));
        client.exec();
    }
}
