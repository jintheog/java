package d.inheritance.practice_01;

class Vehicle {
    String model;
    double dailyRate;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    double calculateRentalCost(int days){
        return dailyRate *= days;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}

class Car extends Vehicle {
    boolean hasGPS;

    public Car(String model, double dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }
    @Override
    double  calculateRentalCost(int days){
//        dailyRate *= days;
//        if(hasGPS){
//            dailyRate = dailyRate + days * 10000;
//        }
//        return dailyRate;
        double baseCost = super.calculateRentalCost(days);
        if(hasGPS){
            baseCost = baseCost + days * 10000;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                ", hasGPS=" + hasGPS +
                '}';
    }
}

class Truck extends Vehicle {
    double capacity;

    public Truck(String model, double dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }
    @Override
    double calculateRentalCost(int days){
        //return dailyRate = (dailyRate * days) + ((capacity * 5000)*days);
        double baseCost = super.calculateRentalCost(days);
        return baseCost+=capacity * 5000 * days;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                ", capacity=" + capacity + "톤"+
                '}';
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + car.calculateRentalCost(3) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + truck.calculateRentalCost(5) + "원");
    }
}
