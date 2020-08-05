package geekbrains.hw_1_6;

public class Dog extends Animal{                                    // Для реализации наследования используем ключевое слово extends;

    public Dog(String type, String name, String color, int age) {   // Через Alt + Insert вызвал конструктор, определенный в суперклассе Animal;
        super(type, name, color, age);
    }

    @Override                                                       // Указываем аннотацию @Override о переопредлении метода суперкласса;
    public void run(int lengthRun) {
        if (lengthRun <= 500 && lengthRun > 0) {
            System.out.println(type + " " + name + " ran " + lengthRun + " meters \n");
        } else if (lengthRun > 500) {
            System.out.println(type + " " + name + " will get tired!\n");
        } else {
            System.out.println("Enter a positive number!\n");
        }

    }

    @Override                                                       // Указываем аннотацию @Override о переопредлении метода суперкласса;
    public void swim(int lengthSw) {
        if (lengthSw <= 10 && lengthSw > 0) {
            System.out.println(type + " " + name + " swam " + lengthSw + " meters \n");
        } else if (lengthSw > 10) {
            System.out.println(type + " " + name + " will get tired!\n");
        } else {
            System.out.println("Enter a positive number!\n");
        }

    }

}
