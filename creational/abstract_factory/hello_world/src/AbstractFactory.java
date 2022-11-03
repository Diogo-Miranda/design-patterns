public class AbstractFactory {
    public Write createWriteFile() {
        return new WriteFile();
    }

    public Write createWriteTerminal() {
        return new WriteTerminal();
    }
}
