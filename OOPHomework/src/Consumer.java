public class Consumer {
    int id;
    int birthYear;
    int salary;
    String firstName;
    String lastName;

    public Consumer (int id,String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Consumer(int id, String firstName, String lastName,int birthYear,int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;

    }
}
