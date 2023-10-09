import java.util.Comparator;

class NameComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.name.compareTo(w2.name);
    }

}
class AgeComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.age - w2.age;
    }

}class WeightComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.weight - w2.weight;
    }

}