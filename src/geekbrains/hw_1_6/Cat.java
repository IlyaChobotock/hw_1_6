package geekbrains.hw_1_6;

public class Cat extends Animal {                                   // Для реализации наследования используем ключевое слово extends;

    public Cat(String type, String name, String color, int age) {   // Через Alt + Insert вызвал конструктор, определенный в суперклассе Animal;
        super(type, name, color, age);
    }

    @Override                                                       // Указываем аннотацию @Override о переопредлении метода суперкласса;
    public void run(int lengthRun) {
        if (lengthRun <= 200 && lengthRun > 0) {
            System.out.println(type + " " + name + " ran " + lengthRun + " meters \n");
        } else if (lengthRun > 200) {
            System.out.println(type + " " + name + " will get tired!\n");
        } else {
            System.out.println("Enter a positive number!\n");
        }
    }

    @Override                                                       // Указываем аннотацию @Override о переопредлении метода суперкласса;
    public void swim(int lengthSw) {
        System.out.println(type + " " + name + " can't swim\n");
    }

}
