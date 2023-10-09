import java.util.ArrayList;
public class Movie extends Asset{
    ArrayList actors;
    Consumer director;



    public Movie(int id, String name, ArrayList<Integer> scores,
                 int release_year, Category category, int price,
                 String type, ArrayList actors, Consumer director){
        super(id, name, scores, release_year, category, price, type);
        this.actors = actors;
        this.director = director;
    }

    public void addActor(Consumer actor){
        actors.add(actor);
    }

    public ArrayList getActors() {
        return actors;
    }
    public Consumer getDirector() {
        return director;
    }
    @Override
    public void showDetail(){
        super.showDetail();
        System.out.println("Actors:");
        for (Object actor : actors){
            System.out.println("-"+getActors());
        }
        System.out.println("-"+getDirector());
    }
}
