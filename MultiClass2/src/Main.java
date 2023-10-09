public class Main {
    public static void main(String[] args) {

//        Season season = Season.WINTER;
//        System.out.println(season);
//
//        //postOfficeExample();
//
//        Course course1 = Course.MATH1;
       Course[] allCourses = Course.values();

        for(Course c : allCourses){
            System.out.println(c+" given by "+c.getLecturer());
        }

//        System.out.println(course1.getLecturer());

    }

     static void postOfficeExample(){
        Post post = new Post("this is some post...", "KARABUK KILAVUZLAR VILLAGE", "ÇANKAYA CENTER");
        PostOffice postOffice1 = new PostOffice("KARABUK PO");
        postOffice1.send(post);

        PostOffice postOffice2 = new PostOffice("ANKARA PO");
        postOffice2.receive(post);

    }
}