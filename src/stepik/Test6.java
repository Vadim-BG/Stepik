package stepik;
/*
Последняя цифра

Дано натуральное число. Выведите его последнюю цифру.

Входные данные

Вводится натуральное число.

Выходные данные

Выведите ответ на задачу.
*/

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a % 10);
    }
}
