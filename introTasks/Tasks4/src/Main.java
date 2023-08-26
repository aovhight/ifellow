import java.util.Random;
import static java.lang.Math.abs;

/* ЗАДАНИЕ 4
   Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов.
   На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
   Расчет угла производить относительно реального поведения стрелок часов.
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int hour = rnd.nextInt(0, 12);
        int minutes = rnd.nextInt(0,60);

        System.out.printf("Hour %d\n", hour);
        System.out.printf("Minutes %d\n", minutes);
        int angleBetweenHM = angleBetween(hour, minutes);
        if(angleBetweenHM < 180) {
            System.out.println(String.format("Угол между стрелками равен: %d градусов", angleBetweenHM));
        } else {
            System.out.println(String.format("Угол между стрелками равен: %d градусов", angleBetweenHM - 180));
        }
    }
    public static int angleBetween(int hour, int minutes) {
        int angleHour = (360/12)*hour;
        int angleMinute = (360/60)*minutes;
        int angleBetween = abs(angleHour - angleMinute);

        return angleBetween;
    }
}
