import java.util.Scanner;

public class Account {
    //Properties
    private String ownerName;
    private double balance;
    private String password;

    public Account(String name, double balance, String password){
        this.ownerName=name;
        this.balance=balance;
        this.password= password;
    }
    public void add(double amount) {
        balance +=amount;
    }
    public double getBalance() {
        return balance;
    }
    public void setownerName(String name){
        ownerName=name;
    }
    public String getownerName(){
        return this.ownerName;
    }
    public void withdraw(double amount){
        Scanner scanner =new Scanner(System.in);
        Boolean isMatched=false;
        for(int i=0;i<3;i++){
            System.out.println("Please enter the 4-digit password:");
            String password= scanner.nextLine();
            if(password.equals(this.password)){
                this.balance-=amount;
                isMatched=true;
                break;
            }
        }
        if(!isMatched)
            System.out.println("Your account has been blocked,please try again");
    }
}

