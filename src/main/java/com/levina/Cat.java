package com.levina;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);
    }

    Cat view() {
        if (gender == "М") {
            System.out.println("Я кот " + name);
        } else if (gender == "Ж") {
            System.out.println("Я кошка " + name);
        } else {
            System.out.println("Такого пола нет");
        }
        return this;
    }
}
