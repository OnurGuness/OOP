import java.nio.charset.CoderResult;

public enum Course {
    COMP_PROGRAMMING(100, "MIKE TYSON"),
    ALGEBRA(105, "JACK CHEN"),
    MATH1(106, "GAUSS");

    private int courseId;
    private String lecturer;

    Course(int id, String lecturer) {
        this.courseId = id;
        this.lecturer = lecturer;
    }
    public String getLecturer(){
        return lecturer;
    }
}
