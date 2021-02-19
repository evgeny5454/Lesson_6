package ru.geekbrains.lesson6;

public class Cat extends Animal {
    int catLimit = 200;
    public static int numb;

    public Cat (String name, int distance) {
        this.name = name;
        this.distance = distance;
        numb++;
    }

    @Override
    public void actionDistance() {

        if (distance <= catLimit) {
            System.out.println("Кот: " + name + " пробежал " + distance + " м ");
        } else {
            System.out.println("Кот: " + name + " не может бежать более " + catLimit + " м ");
        }
    }

    @Override
    public void actionSwim() {

        System.out.println("Кот: " + name + " не умеет плавать");
    }

    public static int counter () {
        return numb;
    }

    @Override
    public void setNumb() {
        System.out.println("Котов создано " + counter());
    }
}

