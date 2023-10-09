import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Account account1 = new Account("Ali",200.0,"1234");
       account1.add(100.0);
        System.out.println("Balance: "+account1.getBalance());
        System.out.println("Ownername of account: "+account1.getownerName());

        account1.withdraw(10);
        System.out.println("Balance: "+account1.getBalance());
    }

}