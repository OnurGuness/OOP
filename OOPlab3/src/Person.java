public class Person {
    public static void main(String[] args) {
            private String firstName;
            private String lastName;
            private int age;
            private String job;

            public Person(String firstName, String lastName, int age, String job) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.job = job;
            }
            public void showInfo() {
                System.out.println("Full name:" + this.firstName + " " + this.lastName + "Age:" + this.age + "Job:" + this.job);
            }
    }
}
