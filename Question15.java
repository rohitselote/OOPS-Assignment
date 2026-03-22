abstract class Ride {
    protected double distance;

    public Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    public BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    public AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    public CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        for (Ride ride : rides) {
            System.out.println("Fare: ₹" + ride.calculateFare());
        }
    }
}
