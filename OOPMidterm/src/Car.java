public class Car {
    private String brands;
    private int maxSpeed;
    private int year;

    Car(String brands, int year){
        this(brands,180,year);
    }
    Car(String brands){
        this(brands,180,2022);
    }
    public Car(String brands,int maxSpeed,int year){
        setBrands(brands);
        setMaxSpeed(maxSpeed);
        setYear(year);
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed =maxSpeed;
    }
    public void setYear(int year){
        if(year>2022)
            throw new IllegalArgumentException("Year cannot be greater than 2022");
        this.year=year;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public int getYear() {
        return year;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getBrands(){
        return brands;
    }
    public String printCarInfo(){
        return String.format("Brand: %s Year: %d Speed: %d",this.brands,this.year,this.maxSpeed);
    }
}
