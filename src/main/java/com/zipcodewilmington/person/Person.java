package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        setGetName("");
        setGetAge(Integer.MAX_VALUE);
    }

    public Person(int age) {
        setGetAge(age);
    }

    public Person(String name) {
        setGetName(name);
    }

    public Person(String name, int age) {
        setGetName(name);
        setGetAge(age);
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

    public String setGetName(String name) {
        this.name = name;
        return name;
    }

    public Integer setGetAge(int age) {
        this.age = age;
        return age;
    }
}
