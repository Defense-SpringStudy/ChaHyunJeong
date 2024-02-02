package diverse.abstract1;


import diverse.Animal;

public class AbstractMain1 {

    public static void main(String[] args) {


        AbstractDog dog = new AbstractDog();
        AbstractCat cat = new AbstractCat();
        AbstractCow cow = new AbstractCow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
