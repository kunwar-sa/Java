public class Car {

    // members
    String brand;
    int weight;
    String color;
    boolean isAutomatic;

    // constructor
    Car(String brand, int weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    // method
    public void getBrand() {
        System.out.println("Brand of the car is:" + this.brand);
    }

    public void getWeight() {
        System.out.println("Weight of the car is:" + this.weight);
    }

    public void getColor() {
        System.out.println("Color of the car is:" + this.color);
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public static void main(String[] args) {
        Car brand = new Car("Impala", 2000, "Black");
        brand.getBrand();
        brand.getWeight();
        brand.getColor();
        System.out.println("The car is automatic: " + brand.isAutomatic);

        brand.setIsAutomatic(true);

        System.out.println("The car is automatic: " + brand.isAutomatic);

    }

}
