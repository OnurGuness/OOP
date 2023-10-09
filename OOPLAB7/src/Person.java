public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public int id;

    public Person(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0, 0);
        this.id++;
    }

    public Person(int id) {
        this("", "", 0, id);
    }

    public Person() {
        this("", "");
    }

    public void showDetail() {
        System.out.println(" First Name: " + firstName + " Last Name: " + lastName + "Age:" + age + " Id:" + id);
    }
}
