import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DisneyPlus {
    static ArrayList<Asset> assets;
    User credential;
    boolean isLogin = false;

    public DisneyPlus(ArrayList<Asset> assets,User credential){
        this.assets = assets;
        this.credential = credential;
        this.isLogin = false;
    }

    public static void N6(int i) {
    }

    public void login(User user){
        if(credential!=null&&credential.checkPassword(user.getPassword())){
            isLogin = true;
            credential = user;
        }
    }
    public void addMovie(Movie m1){
        assets.add(m1);
    }
    Boolean removeMovie(int movieId){
        for (Asset a : this.assets){
            if (a.id == movieId){
                assets.remove(a);
            }
        }
        return true;
    }

    public void addBook(Book b1){
        assets.add(b1);
    }

     Boolean removeBook(int bookId){
        for (Asset b : this.assets){
            if (b.id == bookId){
                assets.remove(b);
            }
        }
        return true;
    }

    public void addAsset(Asset m2){
        this.assets.add(m2);
    }

    double averageScore = 0;
    public void highestAverage(Asset m1){
        if(m1.getAvgScore()>averageScore)
            averageScore = m1.getAvgScore();
        m1.showDetail();
    }

    public void lowestAverage(Movie m1){
        ArrayList list = m1.scores;
        Collections.sort(list);
    }

    public static void N1(){
        int oldest = 2100;
        for (Asset a : assets){
            oldest = a.release_year;
        }
        for (Asset a : assets){
            if(a.release_year == oldest){
                System.out.println(a.id+" "+a.name+" "+a.release_year);
            }
        }
    }

    public void N2(){
        double min = 100;
        Asset LowestScoreMaterail = null;
        for(Asset a : this.assets){
            if(a.getMinScore() < min){
                min = a.getMinScore();
                LowestScoreMaterail = a;
            }
        }
        LowestScoreMaterail.showDetail();
    }

    public void N3(int movie_id){
        int max = 0;
        Asset theMostExpensiveMaterial = null;
        for (Asset a : this.assets){
            if(a.price > max && a.id == movie_id){
                max = a.price;
                theMostExpensiveMaterial = a;
            }
        }
        theMostExpensiveMaterial.showDetail();
    }

    public static void N4(int categoryId){
        int min = 100;
        Asset theLeastExpensiveMaterial = null;
        for (Asset a : this.assets){
            if(a.price < min && a.id == categoryId){
                min = a.price;
                theLeastExpensiveMaterial = a;
            }
        }
        theLeastExpensiveMaterial.showDetail();
    }
    public static void N5(int actorId){
        for (Asset a: this.assets) {
            if (a.type.equals("movie")){
                Movie movie = (Movie) a;
                for (Consumer c: movie.actors) {
                    if (c.id == actorId){
                        movie.showDetail();
                        System.out.println("*******");
                    }
                }
            }
        }
    }

    public void N6(){
        int GetAvgScore = 0;
        for (Asset a : assets){
            if (a.getAvgScore()<GetAvgScore){
                GetAvgScore = (int) a.getAvgScore();
            }
        }
        for (Asset a : assets){
            if (a.getAvgScore() == GetAvgScore){
                if (a.getAvgScore() == GetAvgScore){
                    System.out.println(a.id+" "+a.name+" "+a.getAvgScore());
                }
            }
        }
    }
}
