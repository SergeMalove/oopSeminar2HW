public class Main {
    public static void main(String[] args) {
        // Ниже созданы по два экземпляра каждого класса, но используется в тестах только один.
        // Просто создаются по двум разным конструкторам.
        Car car1 = new Car(101, "Тачила", "Лютая", 2001, 62, 43);
        Car car2 = new Car(102, "Ведровер", "Почефырка", 53);
        Aircraft aircraft1 = new Aircraft(201, "Бройлер", "747", 1995, 12500, true);
        Aircraft aircraft2 = new Aircraft(202, "Аирбас", "321", 2020, 11100);
        Boat boat1 = new Boat(301, "Самоделка", "поБеда", 1986, 25, true);
        Boat boat2 = new Boat(302, "Голландец", "Летучий", 1856, 18);

        car1.displayInfo();
        car1.startEngine();
        car1.accelerate(20);
        car1.brake();
        car1.stopEngine();
        System.out.println("Сейчас в баке автомобиля " + car1.getCurrentFuelLevel() + " литров топлива. Заправим его.");
        car1.refuel(10);
        System.out.println("Теперь в баке автомобиля " + car1.getCurrentFuelLevel() + " литров топлива.\n");

        aircraft1.displayInfo();
        aircraft1.land();
        aircraft1.brake();
        aircraft1.stopEngine();
        aircraft1.startEngine();
        aircraft1.takeOff();
        aircraft1.accelerate(800);
        System.out.println();

        boat1.displayInfo();
        boat1.stopSwimming();
        boat1.brake();
        boat1.stopEngine();
        boat1.startEngine();
        boat1.startSwimming();
        boat1.accelerate(10);
    }
}
