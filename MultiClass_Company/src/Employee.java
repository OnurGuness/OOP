public class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }
    int getId(){
        return id;
    }
}
