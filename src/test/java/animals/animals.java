package animals;

public class animals {
    private String name;

    public animals(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("omnomnom");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
