import java.util.Arrays;

//    Задание 2: Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»

public class Main {
    public static void main(String[] args) {
        String word = "Hello";
        char[] ch = word.toCharArray();
        char a = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (a == ch[i])
                System.out.println("Повторяющийся символ - " + ch[i]);
            else a = ch[i];
        }
    }
}
