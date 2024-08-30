package org.example.util;

import org.example.bean.Student;
import org.example.main.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentUtil {
    public static void registerStudents() {
        int registerRequest = InputUtil.requireNumber(
                "Do you want to enter student information?"
                + "\n 1) Yes"
                + "\n 2) No"
        );
        
        if(registerRequest == 1) registeringProcess();
        else return;

        MenuUtil.showSuccessMessage();
        StudentUtil.printAllRegisteredStudents();
    }

    public static void registeringProcess(){
        if(Config.students.isEmpty()){
            Config.students.add(enterStudentInformation());
            registeringProcess();
        }else{
            continueWithRegistration();
        }
    }

    public static void continueWithRegistration(){
        int registerRequest = InputUtil.requireNumber(
                "Do you want to continue registering process?"
                        + "\n 1) Yes"
                        + "\n 2) No"
        );
        if(registerRequest == 1){
            Config.students.add(enterStudentInformation());
            registeringProcess();
        }else{
            return;
        }
    }

    public static Student enterStudentInformation() {
        int id = MenuUtil.requireId();
        String name = MenuUtil.requireName();
        String lastname = MenuUtil.requireSurname();
        int age = MenuUtil.requireAge();
        String classname = MenuUtil.requireClassName();

        Student student = new Student(id,name, lastname, age, classname);
        return student;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) return;
        else Config.students.forEach(students ->
                                    System.out.println(students.getAllInformation())
                             );
    }

    public static void findAndPrintStudents() {
        String text = InputUtil.requireText("Enter name,surname or classname");
        List<Student> studentList = StudentUtil.findStudents(text);

        studentList.forEach(result -> System.out.println(result.getAllInformation()));
    }

    public static List<Student> findStudents(String text) {
        List<Student> list = new ArrayList<>();
        for (Student student : Config.students) {
            if (student.getName().equalsIgnoreCase(text) ||
                student.getLastname().equalsIgnoreCase(text) ||
                student.getClassName().equalsIgnoreCase(text))
            {
                list.add(student);
            }
        }
        return list;
    }


    public static void updateStudents() {
        int studentId = InputUtil.requireNumber(
                "Which person would you like to change." +
                    "You must enter the student id?"
        );
        Student selectedStudent = Config.students.get(studentId);
        String changeParams = InputUtil.requireText(
                "Which information would you like to change?"
        );

        List<String> parameters = Arrays.asList(changeParams.split(","));
        parameters.forEach(params -> {
            if (params.equalsIgnoreCase("name")) {
                selectedStudent.setName(InputUtil.requireText(
                        "new name")
                );

            } else if (params.equalsIgnoreCase("surname")) {
                selectedStudent.setLastname(InputUtil.requireText(
                        "new surname")
                );

            } else if (params.equalsIgnoreCase("age")) {
                selectedStudent.setAge(InputUtil.requireNumber(
                        "new age")
                );

            } else if (params.equalsIgnoreCase("classname")) {
                selectedStudent.setClassName(InputUtil.requireText(
                        "new classname")
                );

            }
        });
    }
}
