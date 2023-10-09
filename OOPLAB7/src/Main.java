public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmet", "Gök", 15, 1);
        Person p2 = new Person("Gökhan", "Yıldız");
        Person p3 = new Person(2);
        Person p4 = new Person();

        Person[] persons = {p1, p2, p3, p4};
        for (Person p : persons)
            p.showDetail();
    }
}