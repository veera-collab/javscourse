// Class definition for Main (it contains the main method)
class Car {
    String brand;
    int speed;

    // Method to display car information
    void displayinfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class containing the main method
public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();
        
        // Assign values to the object properties
        myCar.brand = "Toyota";  // Fixed the typo "toyaota" to "Toyota"
        myCar.speed = 120;
        
        // Call the method to display car information
        myCar.displayinfo();
    }
}
