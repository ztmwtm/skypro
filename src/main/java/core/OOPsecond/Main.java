package core.OOPsecond;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.wheelsTransportService(car);
        station.wheelsTransportService(car2);
        station.wheelsTransportService(bicycle);
        station.wheelsTransportService(bicycle2);
        station.wheelsTransportService(truck);
        station.wheelsTransportService(truck2);
    }
}
