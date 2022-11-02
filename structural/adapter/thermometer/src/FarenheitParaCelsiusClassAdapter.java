public class FarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements IMedidorCelsius {
    @Override
    public double medirTemperatura() {
        var tempeFarenheit = super.getTempraturaFarenheit();
        return (tempeFarenheit - 32) / 1.8;
    }
}
