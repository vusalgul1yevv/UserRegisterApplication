package org.example.bean;

public class Student {
    private String name;
    private String lastname;
    private String age;
    private String className;

    public Student() {
    }

    public Student(String name, String lastname, String age, String className) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
