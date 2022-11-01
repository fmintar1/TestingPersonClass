package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.setName("");
        this.getName();
        this.setAge(Integer.MAX_VALUE);
        this.getAge();
    }

    public Person(int age) {
        this.setAge(age);
        this.getAge();
    }

    public Person(String name) {
        this.setName(name);
        this.getName();
    }

    public Person(String name, int age) {
        this.setName(name);
        this.getName();
        this.setAge(age);
        this.getAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
