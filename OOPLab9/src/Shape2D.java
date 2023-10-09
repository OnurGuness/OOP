public abstract class Shape2D {
    public final double PI=3.14;
    public double height;
    public double width;
    public double radius;
    //Constructor-1
    public Shape2D(double width,double height){
        this.width=width;
        this.height=height;
    }
    //Constructor-2
    public Shape2D(double radius){
        this.radius=radius;
    }
    //Constructor-3
    public Shape2D(){

    }
    public abstract double getArea();
    public abstract String toString();
}
