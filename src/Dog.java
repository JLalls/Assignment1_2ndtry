public class Dog extends Animal {
    private Boolean owner;
    private String furType;


    public Dog(String name, int legs, String noise, Boolean owner, String furType) {
        super(name, legs, noise);
        this.owner = owner;
        this.furType = furType;
    }
}

