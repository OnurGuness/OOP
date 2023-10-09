public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Eagle eagle = new Eagle();
        Duck duck = new Duck();

        Animal[] animals = {cat,eagle,duck};

        for (Animal animal : animals){
            if (animal instanceof Swimmable){
                ((Swimmable)animal).swim();
            }
        }
    }
}