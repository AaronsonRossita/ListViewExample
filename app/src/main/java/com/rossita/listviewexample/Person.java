package com.rossita.listviewexample;

import androidx.annotation.NonNull;

public class Person {

    private String name;
    private int age;
    private boolean smart;

    public Person(String name, int age, boolean smart) {
        this.name = name;
        this.age = age;
        this.smart = smart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name : " + name + ", Age : " + age + "" +
                ", Smart : " + smart;
    }
}
