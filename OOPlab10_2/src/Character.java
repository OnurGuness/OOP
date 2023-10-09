public abstract class Character {
    int id;
    String name;
    protected int health;
    protected int barrier;
    protected boolean isAlive;

    Character(int id, String name){
        this.id = id;
        this.name = name;
        health = 100;
        barrier = 100;
        isAlive = true;
    }

    void takeDamage(int amount){
        if(barrier <0) this.health += barrier;
        this.barrier -=amount;
        if(barrier <= 0)
            isAlive=false;
    }

    abstract void defense();
}
