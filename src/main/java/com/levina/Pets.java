package com.levina;

public class Pets {

    protected String name;
    int age;
    int weight;
    String food;
    String gender;
    String breed;
    String favouriteHobby;


    public Pets(String name) {
        this.name = name;
    }

    void food() {
        System.out.println("Мой корм это " + food);
    }

    public int getAge() {
        return age;
    }

    void host() {
        System.out.println("У меня есть хозяин!");
    }

    void breed() {
        System.out.println("Моя порода " + breed);
    }

    void favouriteHobby() {
        System.out.println("Мое любимое занятие " + favouriteHobby);
    }
}
