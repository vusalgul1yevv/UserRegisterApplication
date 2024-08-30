package org.example.util;


public class MenuUtil {

    public static void processMenu(int selectedMenu) {
        if (selectedMenu == 1) {
            StudentUtil.registerStudents();
        } else if (selectedMenu == 2) {
            StudentUtil.printAllRegisteredStudents();
        } else if (selectedMenu == 3) {
            StudentUtil.findAndPrintStudents();
        } else if (selectedMenu == 4) {
            StudentUtil.updateStudents();
        }
    }

    public static int requireId() {
        return InputUtil.requireNumber("Enter id");
    }
    public static String requireName() {
        return InputUtil.requireText("Enter name");
    }

    public static String requireSurname() {
        return InputUtil.requireText("Enter surname");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("Enter age");
    }

    public static String requireClassName() {
        return InputUtil.requireText("Enter classname");
    }

    public static void showSuccessMessage() {
        System.out.println("Operation completed \nStudents registered");
    }
}
