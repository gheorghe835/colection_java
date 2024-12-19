package vehicle;

// Программа, в которой используется класс Vehicle,
class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    // количество пассажиров
    // запас топлива в литрах
    // расход топлива в км. на литр

    int range(){
        return fuelcap*mpg;
    }
    public Vehicle() {
    }

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
}
