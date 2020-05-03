package stepik;

import java.util.Scanner;

/*
Сумма цифр
Дано трехзначное число. Найдите сумму его цифр.

Входные данные

Вводится трехзначное число.

Выходные данные

Выведите ответ на задачу.
 */
public class Test9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int a1 = a / 100;
        int a2 = (a / 10) % 10;
        int a3 = a % 10;

        System.out.println(a1 + a2 + a3);
    }

}
