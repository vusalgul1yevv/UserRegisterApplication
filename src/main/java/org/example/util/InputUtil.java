package org.example.util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        return text;
    }

    public static int requireNumber(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
