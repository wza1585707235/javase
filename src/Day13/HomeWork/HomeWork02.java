package Day13.HomeWork;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.split("\\d").length != 0 | str.startsWith("0")) {
            System.out.println(false);
        } else if (str.length() > 12 | str.length() < 5) {
            System.out.println(false);
        } else System.out.println(true);
    }
}

