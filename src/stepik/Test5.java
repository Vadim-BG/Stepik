package stepik;
/*МКАД
Длина Московской кольцевой автомобильной дороги — 109 километров.
Байкер Вася стартует с нулевого километра МКАД и едет со скоростью v километров в час.
На какой отметке он остановится через t часов?

Входные данные

Программа получает на вход значения v и t. Если v>0, то Вася движется в положительном направлении по МКАД,
если же значение v<0, то в отрицательном.

Выходные данные

Программа должна вывести целое число от 0 до 108 — номер отметки, на которой остановится Вася.*/

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = 109;
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int result = 0;

        if (v * t > 0) {
            result = (v * t) % l;
        } else if (v * t <= 0) {
            result = (l + ((v * t) % l) % l);
        }

        System.out.println(result);
    }
}
