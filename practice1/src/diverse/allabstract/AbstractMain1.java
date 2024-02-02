package diverse.allabstract;


public class AbstractMain1 {

    public static void main(String[] args) {


        AbstractDog dog = new AbstractDog();
        AbstractCat cat = new AbstractCat();
        AbstractCow cow = new AbstractCow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);

    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
