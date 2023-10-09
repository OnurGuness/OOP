public class workerInfo {
    String name;
    int socialSecurityNumber;
    float wage;
    int workerHours;

    public workerInfo(){
    }
    float displaySalary() {
        float salary = wage * workerHours;
        return salary;
    }
}
