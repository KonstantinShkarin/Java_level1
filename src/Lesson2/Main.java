/**
 * Java 1 Lesson 6 homework Animal
 *
 * @author Konstantin Shkarin
 * @version date Dec 09, 2018
 *
 */


package Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дистанцию бега (в метрах)");
            int distanceRun = scanner.nextInt();

            System.out.println("Введите высоту прыжка (в метрах)");
            int distanceJump = scanner.nextInt();

            System.out.println("Введите дистанцию плавания (в метрах)");
            int distanceSwim = scanner.nextInt();

            Animal[] animals = {new Dog("Жучка", 2), new Cat("Барсик", 1)};
            for (Animal animal : animals) {
                System.out.println(animal);
                System.out.println("cможет пробежать? " + animal.run(distanceRun));
                System.out.println("может пропрыгать? " + animal.jump(distanceJump));
                System.out.println("может проплыть? " + animal.swim(distanceSwim));
            }
        }
    }
}

interface IAnimal{
    public boolean run(int distance);
    public boolean swim(int distance);
    public boolean jump(int height);

        }
abstract class Animal implements IAnimal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя животного: "+name +", "+"Возраст: "+age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Тип животного: Собака, "+super.toString();
    }

    @Override
    public boolean run(int distance) {
        if (distance <500) return true;
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance<10) return true;
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height<0.5) return true;
        return false;
    }
}

class Cat extends Animal {
    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Тип животного: Кошка, "+super.toString();
    }

    @Override
    public boolean run(int distance) {
        if (distance <200) return true;
        return false;
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (height<2) return true;
        return false;
    }
}



