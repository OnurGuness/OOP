import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please your name:");
        String name= scanner.next();


        System.out.println("Please enter your socail security number:");
        int socialSecurityNumber= scanner.nextInt();
        System.out.println(name+" "+socialSecurityNumber);

        System.out.println("Please your wage:");
        int wage= scanner.nextInt();

        System.out.println("Please your worker hours:");
        int workerHours= scanner.nextInt();


        workerInfo w1 = new workerInfo();
        w1.name = "Jules";
        w1.wage=wage;
        w1.workerHours=workerHours;
        w1.displaySalary();
        System.out.println(w1.displaySalary());
    }
    private static void displaySalary(){

    }

}