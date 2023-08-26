import java.util.Scanner;
/*           Задание 3:
             Напишите класс BaseConverter для конвертации из градусов по Цельсию в
             Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
             и делает конвертацию.
             При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты
*/
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("Введите градусы Цельсия: ");
            Scanner degree = new Scanner(System.in);
            int cels = degree.nextInt();
            System.out.print("Конвертация в Кельвины(1) или Фаренгейт(2): ");
            Scanner choiсeScan = new Scanner(System.in);
            int choiсe = choiсeScan.nextInt();
            switch (choiсe) {
                case (1):
                    System.out.println(BaseConverter.convertToKelvin(cels));
                    break;
                case (2):
                    System.out.println(BaseConverter.convertToFahrenheit(cels));
                    break;
                default:
                    System.out.println("Exception: 1 or 2");
            }
        }
    }
}
