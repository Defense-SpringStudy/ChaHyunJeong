package diverse;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        Animal[] animalArr = {dog, cow, cat};


        for (Animal animal : animalArr) {
            System.out.println("시작");
            animal.sound();
            System.out.println("종료");
        }
    }
}
