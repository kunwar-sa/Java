class Animal {
    public void makeNoise() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    public void makeNoise() {
        System.out.println("Dog barks");
    }
}

class Shibainu extends Dog {

    @Override
    public void makeNoise() {
        System.out.println("Shibainu barks in Japanese");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Dog obj = new Shibainu();
        obj.makeNoise();
    }
}
