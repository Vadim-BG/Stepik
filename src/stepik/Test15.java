package stepik;

import java.util.Scanner;

/*Стоимость покупки
Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Входные данные

Программа получает на вход три числа: a, b, n.

Выходные данные

Программа должна вывести два числа: стоимость покупки в рублях и копейках.*/
public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cost = c * (100 * a + b);

        System.out.println(cost / 100 + " " + cost % 100);

    }
}
