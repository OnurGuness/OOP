public class Square extends Shape2D{
    public Square(double width){
        super(width,width); //Using Constructor-1
        //this.width=width;
    }

    @Override
    public double getArea(){
        return width*width;
    }

    @Override
    public String toString() {
        return "Square Width: "+width+ "Area :"+getArea();
    }
}
