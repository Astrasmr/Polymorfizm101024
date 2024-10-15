import model.*;

public class Main {
    public static void main(String[] args) {
        Serviceable car = new Car("car1");
        Serviceable car2 = new Car("car2");

        Serviceable truck = new Truck("truck11",6);
        Serviceable truck2 = new Truck("truck2", 8);

        Serviceable bicycle = new Bicycle("bicycle1",2);
        Serviceable bicycle2 = new Bicycle("bicycle2",2);


        ServiceStation station = new ServiceStation();
        station.check(truck,bicycle,car);
    }
}