public class Main {
    public static void main(String[] args) {
        try{
            Car car1 = new Car("BMW");
            Car car2 = new Car("AUDI",2022);
            Car car3 = new Car("FERRARI",350,1985);
            Car[] cars = new Car[]{car1,car2,car3};
            Factory factory = new Factory(cars);
            factory.printAllCarInfos();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}