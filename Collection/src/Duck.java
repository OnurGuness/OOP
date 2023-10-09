public class Duck extends Animal implements Swimmable,Flyable,Moveable{
    @Override
    public void fly(){
        System.out.println("Duck flies");
    }

    @Override
    public void move(){
        System.out.println("Duck moves");
    }
    @Override
    public void swim(){
        System.out.println("Duck swims");
    }

}
