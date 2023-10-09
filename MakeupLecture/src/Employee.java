public class Employee {
    private int id;
    private String name;
    private double salary;

    static int number;
    int _number;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        number++;
        _number++;
    }
}
