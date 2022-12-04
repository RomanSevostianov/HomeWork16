import Animals.Herbivores;
import Garage.Bus;
import Garage.Train;
import Garage.Transport;
import Garage.Car;

public class Main {
    public static void main(String[] args) {

        Train locomotive = new Train("Поезд ласточка", "модель Б-901", 1980, "Россия", 301, 3500, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train locomotive2 = new Train("Лениград", "модель Д-125", 2019, "Россия", 270, 1700, "Ленинградский вокзал", "Лениград-Пассажирский", 8);

        Bus B12 = new Bus("Volvo", "3049", 2020, "Italia", 60, 54, 20);

        Car volvo = new Car("Volvo", "SX40", 2020, "Russian", 215, "Sedan", "Avtomat");
        volvo.refillCar();
        System.out.println(B12);
        B12.refillBus();
        System.out.println(locomotive2);

        Herbivores gazelle = new Herbivores("Toma",23,"Cuba",150,"Tree");
        System.out.println(gazelle);
        gazelle.eat();
    }
}