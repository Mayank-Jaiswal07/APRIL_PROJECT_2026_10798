abstract class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double rentPerDay;

    public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    public abstract double calculateRent(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate: $" + rentPerDay + "/day");
    }
}

class Car extends Vehicle {
    private static final double LUXURY_TAX = 50.0;

    public Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        return (rentPerDay * days) + LUXURY_TAX;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Car Details ---");
        super.displayDetails();
    }
}

class Bike extends Vehicle {
    private static final double DISCOUNT_RATE = 0.9;

    public Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    @Override
    public double calculateRent(int days) {
        if (days > 5) {
            return (rentPerDay * days) * DISCOUNT_RATE;
        }
        return rentPerDay * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Bike Details ---");
        super.displayDetails();
    }
}

public class RentalManagementSystem {
    public static void main(String[] args) {
        Vehicle car1 = new Car("CAR-99", "Tesla Model 3", 100.0);
        Vehicle bike1 = new Bike("BIKE-22", "Yamaha MT-07", 40.0);

        processRental(car1, 3);
        System.out.println();
        processRental(bike1, 7);
    }

    public static void processRental(Vehicle v, int days) {
        v.displayDetails();
        System.out.println("Rental Duration: " + days + " days");
        System.out.println("Total Cost: $" + v.calculateRent(days));
    }
}
