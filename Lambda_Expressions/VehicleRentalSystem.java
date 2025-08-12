package Lambda_Expressions;

interface Rentable {
    void rent();
    void returnVehicle();
}

// Car class implementing Rentable
class Car implements Rentable {
    @Override
    public void rent() {
        System.out.println("Car rented. Enjoy your ride!");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned. Thank you!");
    }
}

// Bike class implementing Rentable
class Bike implements Rentable {
    @Override
    public void rent() {
        System.out.println("Bike rented. Have a safe trip!");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned. Thank you!");
    }
}

// Bus class implementing Rentable
class Bus implements Rentable {
    @Override
    public void rent() {
        System.out.println("Bus rented. Drive carefully!");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned. Thank you!");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
