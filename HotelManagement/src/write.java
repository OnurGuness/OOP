import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class write implements Runnable{
    Holder hotel_ob;
    write(Holder hotel_ob){
        this.hotel_ob = hotel_ob;
    }

    @Override
    public void run(){
     try{
         FileOutputStream fout = new FileOutputStream("Backup");
         ObjectOutputStream oos = new ObjectOutputStream(fout);
         oos.writeObject(hotel_ob);
     }
     catch(Exception e){
         System.out.println("Error in writing"+e);
     }
    }
}
