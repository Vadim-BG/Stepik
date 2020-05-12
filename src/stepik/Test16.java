package stepik;

import java.util.Scanner;

/*Разность времен
Даны значения двух моментов времени, принадлежащих одним и тем же суткам:
часы, минуты и секунды для каждого из моментов времени.
Известно, что второй момент времени наступил не раньше первого.
Определите, сколько секунд прошло между двумя моментами времени.

Входные данные

Программа на вход получает три целых числа — часы, минуты, секунды,
задающие первый момент времени и три целых числа, задающих второй момент времени.

Выходные данные

Выведите число секунд между этими моментами времени.*/

public class Test16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


        System.out.println((x - a) * 3600 + (y - b) * 60 + z - c);

    }
}
