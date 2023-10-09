import java.io.Serializable;

public class Worker implements Comparable<Worker>, Serializable {
    String name;
    int age;
    int weight;

    public Worker(String name, int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o ==null || this.getClass() != o.getClass()) return false;

        Worker w = (Worker)o;

        return this.name.equals(w.name) && this.age == w.age && this.weight == w.weight;

    }

    @Override
    public String toString() {
        return "Name: "+ this.name + " Age: "+ this.age+" Weight: "+ this.weight;
    }


//    @Override
//    public int compareTo(Worker w) {
//        if(this.age > w.age) return 1;
//        else if (this.age == w.age) return 0;
//        else return -1;
//    }


//    @Override
//    public int compareTo(Worker w) {
//        return this.age - w.age;
//    }


    @Override
    public int compareTo(Worker w) {
        return this.name.compareTo(w.name  );
    }
}
