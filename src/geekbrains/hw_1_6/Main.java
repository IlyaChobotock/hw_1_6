package geekbrains.hw_1_6;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat ("Cat", "Pushok", "White", 2);
        Animal dog = new Dog ("Dog", "Yakut", "Brown", 5);

        cat.info();
        dog.info();

        // В данных методах запрашиваем число у пользователя через консоль;

        cat.jump();
        dog.jump();

        // В данных методах ввод числа - в коде, как требуется в задании. Методы являются переопределенными;

        cat.swim(2);
        dog.swim(10);

        cat.run(250);
        dog.run(-280);
    }
}
