package stepik;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int l = scanner.nextInt();
        int n = l % (3600 * 24);
        int hours = n / 3600;
        int minutes = n % 3600 / 60;
        int seconds = n % 60;
        System.out.println(hours + ":" + minutes / 10 + minutes % 10 + ":" + seconds / 10 + seconds % 10);

    }
}
