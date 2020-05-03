package stepik;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hypo = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

            if ((a > 0 && a < 1001) && (b > 0 && b < 1001)) {
                System.out.println(hypo);
            } else {
                System.out.println("Введите число в диапазоне от 1 до 1000");
            }
    }
}
