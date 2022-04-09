package animals;

public class Pig extends animals implements AnimalColor {

    public Pig(String name) {
        super(name);

    }

     public void say() {
         System.out.println("Hru");

    }

    @Override
    public void getColor() {

    }
}
