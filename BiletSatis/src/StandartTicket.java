public class StandartTicket extends Ticket{
    StandartTicket(int sNumber,int number){
        super(sNumber,number);
    }

    @Override
    double computePrice(){
        return 10;
    }

    @Override
    void print(){
        System.out.println(seatNumber+" "+number+" "+computePrice());
    }
}
