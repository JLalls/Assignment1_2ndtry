import com.sun.org.apache.xpath.internal.operations.Variable;

public class Animal {
    private String name;
    private int legs;
    private String noise;

    public Animal (String name, int legs, String noise ){
        this.name = name;
        this.legs = legs;
        this.noise = noise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }
}
//   // public Animal(String name,int legs, String speak) ;
//
//
//    Animal(String name) {
//        this.name = "Dog";
//        this.legs = 4;
//        this.speak = "Woof!";
//
//        this.Animal(String name) {
//            this.name = "Snake";
//            this.legs = 0;
//            this.speak = "Hisssss";
//
//            this.Animal(String name) {
//                this.name = "Human";
//                this.legs = 2;
//                this.speak = "Hello, there!"
//            }
//        }
//}//
