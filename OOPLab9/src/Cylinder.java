public class Cylinder extends Shape3D{
    public Cylinder(double height, double radius){
        super(height,radius);
    }
    @Override
    public double getVolume(){
        return PI*radius*radius+height;
    }
    @Override
    public double getArea(){
        return (2*PI*radius*radius) + (2*PI*radius*height);
    }

    @Override
    public String toString(){
        return "Cylinder Volume: "+getVolume() + " Area: "+getArea();
    }
}
