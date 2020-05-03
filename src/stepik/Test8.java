package stepik;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int k = 1;

        System.out.println((a / 10 * k) % 10);
    }
}
