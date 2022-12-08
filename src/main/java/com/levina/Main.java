package com.levina;

public class Main {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        //Создаем 1 кота
        Cat cat1 = new Cat("Пушок");
        cat1.age = 2;
        cat1.weight = 9;
        cat1.gender = "М";
        cat1.food = "Молоко";

        //Создаем 2 кота
        Cat cat2 = new Cat("Бусинка");
        cat2.age = 4;
        cat2.weight = 6;
        cat2.gender = "Ж";
        cat2.food = "Молоко";

        cat1.view();
        cat1.host();
        int cat1Age = cat1.getAge();
        System.out.println(cat1Age);
        cat1.food();
        System.out.println("Мой вес равен " + cat1.weight + " кг.");
        doctor.catHealth(cat1.weight);


        cat2.view();
        cat2.host();
        int cat2Age = cat2.getAge();
        System.out.println(cat2Age);
        cat2.food();
        System.out.println("Мой вес равен " + cat2.weight + " кг.");
        doctor.catHealth(cat2.weight);

        //Создаем 1 собаку
        Dog dog1 = new Dog("Бобик");
        dog1.age = 5;
        dog1.weight = 10;
        dog1.gender = "М";
        dog1.food = "Мясо";
        dog1.mood = "грустный";

        //Создаем 2 собаку
        Dog dog2 = new Dog("Жучка");
        dog2.age = 8;
        dog2.weight = 6;
        dog2.gender = "Ж";
        dog2.food = "Мясо";
        dog2.mood = "веселая";

        dog1.view();
        dog1.host();
        System.out.println("Мой вес равен " + dog1.weight + " кг.");
        doctor.catHealth(dog1.weight);
        dog1.setMood(dog1.mood);

        dog2.view();
        dog2.host();
        System.out.println("Мой вес равен " + dog2.weight + " кг.");
        doctor.catHealth(dog2.weight);
        dog2.setMood(dog2.mood);
    }
}
