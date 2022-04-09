package animals;

public class MyFarm {
    public static void main(String[] args) {
        cat oli = new cat("Oli");

        cat oli2 = new cat("Marfa");

        Dog dog1 = new Dog("Timur");

        Pig peppa = new Pig("Peppa");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();

        peppa.say();
        peppa.setName("SvinkaPeppa");
        System.out.println(peppa.getName());

        System.out.println(dog1.getName());
        dog1.setName("Gherald");
        System.out.println(dog1.getName());
        dog1.getColor();
    }

}
