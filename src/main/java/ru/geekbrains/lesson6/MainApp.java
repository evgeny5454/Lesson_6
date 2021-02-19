package ru.geekbrains.lesson6;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 6 урок");

        Animal animal = new Animal("Пушок",6000,183);
        Animal animal1 = new Animal("Пушок",6000,183);
        Animal animal2 = new Animal("Пушок",6000,183);
        Animal animal3 = new Animal("Пушок",6000,183);
        Animal animal4 = new Animal("Пушок",6000,183);
        Animal animal5 = new Animal("Пушок",6000,183);
        Animal animal6 = new Animal("Пушок",6000,183);
        Cat cat = new Cat("Тимофей",200);
        Dog dog = new Dog("Шарик",150,2);
        Cat cat1 = new Cat("Котэ",500);
        Cat cat2 = new Cat("Котофей",13);
        Cat cat3 = new Cat("Скрытый кот",13);


        cat.actionDistance();
        cat.actionSwim();
        cat1.actionDistance();
        cat2.actionDistance();

        dog.actionDistance();
        dog.actionSwim();


        animal.actionSwim();
        animal.actionDistance();
        animal1.actionSwim();
        animal2.actionSwim();
        animal.setNumb();
        cat.setNumb();
        dog.setNumb();


    }
}
