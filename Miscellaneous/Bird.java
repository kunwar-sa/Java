public class Bird {

    // members
    String name;
    String canFly;
    String color;

    // constructor
    Bird(String birdName, String canFly, String color) {
        name = birdName;
        this.canFly = canFly;
        this.color = color;
    }

    // method
    public void getBirdName() {
        System.out.println("The bird name is: " + this.name);
    }

    public static void main(String[] parameter) {
        Bird ostrich = new Bird("Ostrich", "No", "White");
        ostrich.getBirdName();
    }

}
