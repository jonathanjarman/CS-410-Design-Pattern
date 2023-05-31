// Vehicle interface
interface Vehicle {
    void drive();
}

// Car class (ConcreteProduct)
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

// Motorcycle class (ConcreteProduct)
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle.");
    }
}

// VehicleFactory abstract class
abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    void useVehicle() { // Factory method
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}

// CarFactory class (ConcreteCreator)
class CarFactory extends VehicleFactory {
    @Override 
    Vehicle createVehicle() {
        return new Car();
    }
}

// MotorcycleFactory class (ConcreteCreator)
class MotorcycleFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Motorcycle();
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