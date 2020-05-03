package stepik;
/*
     Дано двузначное число. Найдите число десятков в нем.

     Входные данные
     Вводится двухзначное число.

     Выходные данные
     Выведите ответ на задачу.
 */


import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a / 10 % 10);
    }
}
