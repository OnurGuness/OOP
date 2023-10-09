import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Collection<Integer> c = new ArrayList<Integer>();
//        //type-safety
////        Animal a1 = new Cat();
////        Animal a2 = new Cat();
////        Animal a3 = new Cat();
//
//        c.add(3);
//        c.add(14);
//        c.add(5);
//
//        Iterator iter = c.iterator();
//
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//            iter.remove();
//        }
//        System.out.println("----------");
//
//        for (Integer a : c){
//            System.out.println(a);
//        }

//        c.remove(a2);

//        for (Animal a: c){
//            System.out.println(a.name);
//        }

        List<Animal> animalList = new LinkedList<>();

        Animal a1 = new Cat();
        Animal a2 = new Duck();
        Animal a3 = new Eagle();

        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);

        animalList.removeIf(a -> a.name.equals("duffy"));


        //System.out.println(animalList);

        ListIterator liter = animalList.listIterator(animalList.size());

        while(liter.hasNext()){
            System.out.println(liter.next());
        }
        System.out.println("-----------");
        while(liter.hasPrevious()){
            System.out.println(liter.previous());
            liter.remove();
        }
    }
}