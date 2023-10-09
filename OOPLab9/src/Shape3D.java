public abstract class Shape3D extends Shape2D {
    public double depth;
    public Shape3D(double depth,double width,double height){
        super(width, height);
        this.depth = depth;
    }
    public Shape3D(double height,double radius){
        super(radius);
    }
    public abstract double getVolume();
}
