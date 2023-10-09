import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Han", 23, 76);
        Worker w2 = new Worker("Kenan", 67, 60);
        Worker w3 = new Worker("CanKan", 31, 98);
        Worker w4 = new Worker("Mehmet", 25, 85);

        List<Worker> list = new ArrayList<>();
        list.add(w1);
        try{
            SaveLoadManager.saveToFile(w1,"myworker.txt");
            SaveLoadManager.saveToFile(w2,"myworker.txt");
            SaveLoadManager.saveToFile(w3,"myworker.txt");
            SaveLoadManager.saveToFile(w4,"myworker.txt");
            List<Worker> workers = SaveLoadManager.loadFromFile("myworker.txt");
            for (Worker w : workers)
               System.out.println(w);
            //System.out.println(w);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



//        list.add(w2);
//        list.add(w3);
//        list.add(w4);
//
//        System.out.println("Sorted by name");
//        Comparator comp = new NameComparator();
//        Collections.sort(list, comp);
//
//        for (Worker w : list)
//            System.out.println(w);
//
//        System.out.println("Sorted by age");
//        comp = new AgeComparator();
//        Collections.sort(list, comp);
//        for (Worker w : list)
//            System.out.println(w);
//
//        System.out.println("Sorted by weight");
//        comp = new WeightComparator();
//        Collections.sort(list, comp);
//        for (Worker w : list)
//            System.out.println(w);
//

//        for(Worker w: list)
//            System.out.println(w);
//
//        System.out.println("After sorting");
//        Collections.sort(list);
//        Collections.reverse(list);
//
//        for(Worker w: list)
//            System.out.println(w);
//
//
//        System.out.println(w1==w2);
//        System.out.println(w1.equals(w2));
    }
}