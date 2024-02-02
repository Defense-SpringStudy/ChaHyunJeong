package diverse.allabstract;

public class AbstractCat extends AbstractAnimal {

    @Override
    public void sound(){
        System.out.println("냐옹");
    }

    @Override
    public void move(){
        System.out.println("냥이 이동");

    }
}
