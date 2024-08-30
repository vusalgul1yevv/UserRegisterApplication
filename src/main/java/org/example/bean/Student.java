package org.example.bean;

public class Student {
    private int id;
    private String name;
    private String lastname;
    private int age;
    private String className;

    public Student() {
    }

    public Student(int id,String name, String lastname, int age, String className) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAllInformation() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
