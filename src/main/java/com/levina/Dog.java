package com.levina;

public class Dog extends Pets{

    public Dog(String name) {
        super(name);
    }
    String mood;

    Dog view() {
        if (gender == "М") {
            System.out.println("Я пёс " + name);
        } else if (gender == "Ж") {
            System.out.println("Я собака " + name);
        } else {
            System.out.println("Такого пола нет");
        }
        return this;
    }

    void setMood(String mood) {
        if (mood == "грустный") {
            System.out.println("Пора гулять!");
        } else {
            System.out.println("Поиграю дома!");
        }
    }
}
