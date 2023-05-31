// Vehicle interface (Product) which defines the interface for objects that can be created by the factory method
interface Vehicle {
    void drive();
}

// Car class (ConcreteProduct) which implements Vehicle interface for car objects
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

// Motorcycle class (ConcreteProduct) which implements Vehicle interface for motorcycle objects
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle.");
    }
}

// VehicleFactory abstract class, which creates Vehicle objects
abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    void useVehicle() { // Factory method
        Vehicle vehicle = createVehicle();
        vehicle.drive();// Use the vehicle
    }
}

// CarFactory class (ConcreteCreator) which creates Car objects
class CarFactory extends VehicleFactory {
    @Override 
    Vehicle createVehicle() {
        return new Car(); // Return a Car object
    }
}

// MotorcycleFactory class (ConcreteCreator) which creates Motorcycle objects
class MotorcycleFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Motorcycle(); // Return a Motorcycle object
    }
}

// Main class
public class VehicleFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.useVehicle(); // Output: Driving a car.

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.useVehicle(); // Output: Driving a motorcycle.
    }
}