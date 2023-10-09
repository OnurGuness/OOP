import java.util.ArrayList;

public abstract class Asset {
    int id;
    String name;
    ArrayList<Integer> scores;
    int release_year;
    Category category;
    int price;
    String type;

    public Asset(int id,String name,ArrayList<Integer> scores,int release_year,Category category,int price,String type){
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.category = category;
        this.price = price;
        this.type = type;
    }
    public void addScore(int score){
        scores.add(score);
    }
    int average = 0;
    public double getAvgScore(){
        for (int i=0;i<scores.size();i++){
            average += scores.get(i);
        }
        return average/scores.size();
    }

    public double getMaxScore(){
        double max=0.0;
        for (int i=0;i<scores.size();i++){
            if(scores.get(i)>max){
                max = scores.get(i);
            }
        }
        return max;
    }

    public double getMinScore(){
        double min = scores.get(0);
        for (int i=1;i<scores.size();i++){
            if(scores.get(i)<min){
                min = scores.get(i);
            }
        }
        return min;
    }

    public void showDetail(){}
}
