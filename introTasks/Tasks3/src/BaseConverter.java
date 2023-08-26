public class BaseConverter {
    public static double convertToKelvin(int a) {
        double res = a + 273.15;
        return res;
    }
    public static double convertToFahrenheit(int a) {
        double res = a * (9/5) + 32;
        return res;
    }
}
