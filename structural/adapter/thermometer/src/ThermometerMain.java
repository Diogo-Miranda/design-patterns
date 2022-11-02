public class ThermometerMain {
    public static void main(String[] args) {
        var medidorFarenheit = new MedidorFarenheit();

        System.out.println("[OBJECT-ADAPTER] Test");

        var temp = new FarenheitParaCelsiusObjectAdapter(medidorFarenheit).medirTemperatura();

        System.out.println("[OBJECT-ADAPTER] Temperatura Celsius = " + temp);

        temp = new FarenheitParaCelsiusClassAdapter().medirTemperatura();

        System.out.println("[CLASS-ADAPTER] Test");
        System.out.println("[CLASS-ADAPTER] Temperatur Celsius = " + temp);
    }
}
