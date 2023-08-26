/*         Задание 1: Сформировать и заполнить массив случайным числами и вывести максимальное,
           минимальное и среднее значение.
           Для генерации случайного числа использовать метод Math.random(),
           который возвращает значение в промежутке [0, 1].
*/
public class Main {
    public static void main(String[] args) {

        int[] Array = new int[10];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int)(10*Math.random());
            System.out.println(Array[i]);
        }
        int minRes = min(Array);
        System.out.println("min = " + minRes);
        int maxRes = max(Array);
        System.out.println("max = " + maxRes);
        float average = average(Array, Array.length);
        System.out.println("average value is " + average);
    }
    public static int min(int[] a) {
        int b = a[0];
        for (int i = 1; i < 10; i++) {
            int el = a[i];
            if (b > el) b = el;
        }
        return b;
    }
    public static int max(int[] a) {
        int b = a[0];
        for (int i = 1; i < 10; i++) {
            int el = a[i];
            if (b < el) b = el;
        }
        return b;
    }
    public static float average(int[] a, float b) {
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        float res = sum / b;
        return res;
    }
}
