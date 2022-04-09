package animals;

public class cat extends animals implements AnimalColor {

    public cat(String name) {
        super(name);
    }

    public void say(){
        System.out.println("nya");
    }

    @Override
    public void getColor() {
        System.out.println("Blue");
    }
}
