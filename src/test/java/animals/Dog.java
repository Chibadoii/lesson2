package animals;

public class Dog extends animals implements AnimalColor {
    public Dog(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Gav");
    }


    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
