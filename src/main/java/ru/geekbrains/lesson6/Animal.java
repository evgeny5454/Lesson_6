package ru.geekbrains.lesson6;

public class Animal {
    String name;
    int distance;
    int swim;
    public static int numb;


        public Animal(){

    }
    public Animal (String name, int distance, int swim) {
            this.name = name;
            this.distance = distance;
            this.swim = swim;
            numb++;
    }
    public void actionDistance () {
            System.out.println("Животное: " + name + " пробежало: " + distance + " м ");
    }
    public void actionSwim () {
            System.out.println("Животное: " + name + " проплыло: " + swim + " м ");
    }
    public static int counter() {
            return numb;
    }
    public void setNumb() {
            System.out.println("Животных создано " + counter());
    }
}
