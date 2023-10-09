import java.util.ArrayList;

public class Book extends Asset{
    Consumer writer;
    int numberOfPages;

    public Book(int id, String name, ArrayList<Integer> scores,
                int release_year,Category category,int price,
                String type,Consumer writer,int numberOfPages){
        super(id,name,scores,release_year,category,price,type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }
    public Consumer getWriter(){
        return writer;
    }
    public void setWriter(Consumer writer){
        this.writer = writer;
    }
    public int getNumberOfPages(){
        return  numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
