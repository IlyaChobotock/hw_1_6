package geekbrains.hw_1_6;

import java.util.Scanner;

public class Animal {
    protected String type;
    protected String name;
    protected String color;
    protected int age;

    public Animal(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Прописали необходимые методы в суперклассе;

    public void jump() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Enter the length of the barrier to jump " + type + " " + name + " (meters): ");
        int lengthBarrier = sc.nextInt();
        System.out.println(type + " " + name + " jumped " + lengthBarrier + " meters\n");
    }

    public void swim(int lengthSw) {
        System.out.println(type + " " + name + " swam " + lengthSw + " meters\n");
    }

    public void run(int lengthRun) {
        System.out.println(type + " " + name + " ran " + lengthRun + " meters\n");
    }

    public void info() {
        System.out.printf(" type %s%n name %s%n color %s%n age %d %n%n", type, name, color, age);
    }

}
