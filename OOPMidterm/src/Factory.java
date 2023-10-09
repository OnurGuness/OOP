public class Factory {
    Car[] cars;

    Factory(Car[] cars){
        this.cars = cars;
    }
    void printAllCarInfos(){
        for (Car car : cars)
            System.out.println(car.printCarInfo());
    }
}
