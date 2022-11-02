public class FarenheitParaCelsiusObjectAdapter implements MedidorTemperatura{
    private final MedidorFarenheit medidorFarenheit;

    public FarenheitParaCelsiusObjectAdapter(
            MedidorFarenheit medidorFarenheit
    ) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        var tempFarenheit = medidorFarenheit.getTempraturaFarenheit();
        return (tempFarenheit - 32) / 1.8;
    }
}
