package ru.geekbrains.lesson6;

public class Dog extends Animal {
    int dogLimit = 500;
    int dogLimitSwim = 10;
    public static int numb;

    public Dog (String name, int distance,int swim) {
        this.name = name;
        this.distance = distance;
        this.swim = swim;
        numb++;
    }

    @Override
    public void actionDistance() {

        if (distance <= dogLimit) {
            System.out.println("Собака: " + name + " пробежала " + distance + " м ");
        } else {
            System.out.println("Собака: " + name + " не может бежать более " + dogLimit + " м ");
        }
    }

    @Override
    public void actionSwim() {

        if (swim <= dogLimitSwim) {
            System.out.println("Собака: " + name + " проплыла " + swim + " м ");
        } else {
            System.out.println("Собака: " + name + " не может плыть более " + dogLimitSwim + " м ");
        }
    }

    public static int counter () {
        return numb;
    }

    @Override
    public void setNumb() {
        System.out.println("Собак создано " + counter());
    }
}
