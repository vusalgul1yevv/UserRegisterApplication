package org.example.main;

import org.example.util.InputUtil;
import org.example.util.MenuUtil;

public class Main {
    public static void main(String[] args) {

        while (true) {
            int menu = InputUtil.requireNumber("What do you want to do"
                    + "\n1. Register student"
                    + "\n2. Show all student"
                    + "\n3. Find student"
                    + "\n4. Update student");

            MenuUtil.processMenu(menu);
        }

    }
}
