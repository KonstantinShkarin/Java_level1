import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(200);
        Cat[] cats = {new Cat1("Пушок", 70, 40),
                      new Cat2("Барсик", 50, 30)};
        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            plate.info();
            plate.satietyInfo();
            plate.addFood(10);
            cat.eat(plate);
            plate.info();
            plate.satietyInfo();
        }
    }

}
class Plate{
    private int food;
    private int satiety;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n, int m){
        if (satiety<food) System.out.println("Еды недостаточно для сытости");
        satiety = m;
        food -= n;
            if (food<0) System.out.println("Отрицательное значение еды");


    };
    public void info() {
        System.out.println("plate " + food);
    }
    public boolean satietyInfo () {
        if (satiety >= food) return true;
        return false;
    }

    public void addFood(int a){
        food =+a;
    }
}

class Cat1 extends Cat {
    public Cat1(String name, int appetite, int satiety) {
        super(name, appetite, satiety);
    }
}
class Cat2 extends Cat {
    public Cat2(String name, int appetite, int satiety) {
        super(name, appetite, satiety);
    }
}

abstract class Cat{
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite, satiety);
        plate.satietyInfo();
        System.out.println("Сытость "+ plate.satietyInfo());
    };

}
