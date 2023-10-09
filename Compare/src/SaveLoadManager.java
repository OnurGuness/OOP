import java.io.*;
import java.util.ArrayList;

public class SaveLoadManager {
    static ArrayList<Worker> workers = new ArrayList<>();

    //save
    public static void saveToFile(Worker w,String fileName) throws Exception{
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        workers.add(w);
        objectOut.writeObject(workers);
        objectOut.close();
    }
    //load
    public static ArrayList<Worker> loadFromFile(String fileName) throws Exception {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        ArrayList<Worker> workers = (ArrayList<Worker>)objectIn.readObject();
        objectIn.close();
        return workers;
    }
}

