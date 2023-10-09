import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Consumer c1 = new Consumer(1,"Onur","Güneş",2001,8000);
        Consumer c2 = new Consumer(2,"Hakan","Güneş",2007,3500);
        Consumer c3 = new Consumer(3,"Ahmet Vedat","Güven",2008,2000);
        Consumer c4 = new Consumer(4,"Ramazan","Babayiğit",2004,4500);

        Category ct1 = new Category(1,"135","Love");
        Category ct2 = new Category(2,"246","Action");
        Category ct3 = new Category(3,"890","Comedy");
        Category ct4 = new Category(4,"456","Thriller");

        Movie m1 = new Movie(1,"Valerian ve 1000 Gezegen İmparatorluğu",new ArrayList<Integer>(Arrays.asList(1,2,3)),2010,ct1,150,"movie",new ArrayList<>(Arrays.asList(c2,c3,c4)),c1);
        Movie m2 = new Movie(2,"Çakallarla Dans",new ArrayList<Integer>(Arrays.asList(4,5,6)),2022,ct2,200,"movie",new ArrayList<>(Arrays.asList(c1,c3,c4)),c2);
        Movie m3 = new Movie(3,"Recep İvedik 7",new ArrayList<Integer>(Arrays.asList(7,5,6)),2022,ct3,50,"movie",new ArrayList<>(Arrays.asList(c1,c2,c4)),c3);
        Movie m4 = new Movie(4,"Can Tertip",new ArrayList<Integer>(Arrays.asList(8,4,9)),2015,ct4,100,"movie",new ArrayList<>(Arrays.asList(c1,c2,c3)),c4);

        Book b1 = new Book(5,"Haşırt Dı Blackbord",new ArrayList<Integer>(Arrays.asList(1,2,3)),2018,ct1,25,"book",c1,225);
        Book b2 = new Book(6,"Zeki Ama Çalışmıyor ",new ArrayList<Integer>(Arrays.asList(8,2,6)),2016,ct2,15,"book",c2,80);
        Book b3 = new Book(7,"Keş On Dı Table",new ArrayList<Integer>(Arrays.asList(1,1,1)),2019,ct3,65,"book",c3,200);
        Book b4 = new Book(8,"Ken Taç Dis",new ArrayList<Integer>(Arrays.asList(7,0,3)),2021,ct4,80,"book",c4,250);

        User u1 = new User(1,"Onur","Güneş","ogunes","3546");

        DisneyPlus disneyplus = new DisneyPlus(new ArrayList<Asset>(),u1);
        disneyplus.login(u1);

        disneyplus.addMovie(m1);
        disneyplus.addMovie(m2);
        disneyplus.addMovie(m3);
        disneyplus.addMovie(m4);

        disneyplus.addBook(b1);
        disneyplus.addBook(b2);
        disneyplus.addBook(b3);
        disneyplus.addBook(b4);

        DisneyPlus.N1();
        System.out.println("_____________");
        DisneyPlus.N2();
        System.out.println("_____________");
        DisneyPlus.N3(1);
        System.out.println("_____________");
        DisneyPlus.N4(1);
        System.out.println("_____________");
        DisneyPlus.N5(1);
        System.out.println("_____________");
        DisneyPlus.N6(1);
        System.out.println("_____________");

    }
}