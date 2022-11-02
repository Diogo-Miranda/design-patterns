import java.util.Random;

public class MedidorFarenheit implements IMedidorFarenheit {
    @Override
    public double getTempraturaFarenheit() {
        return new Random().nextDouble();
    }
}
