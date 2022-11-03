import java.util.Random;

public class MainHelloWorld {
    public static void main(String[] args) {
        var factory = new AbstractFactory();
        Write write = null;
        if (new Random().nextInt(2) == 1) {
            write = factory.createWriteFile();
        } else {
            write = factory.createWriteTerminal();
        }
        write.exec();
    }
}
