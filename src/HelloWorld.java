import java.security.DigestException;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Dog fido = new Dog("Fido", 4, "Woof", true, "Fuzzy");

        System.out.println(fido.getNoise());


    }
}