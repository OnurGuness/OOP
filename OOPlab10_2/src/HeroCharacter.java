public class HeroCharacter extends Character implements AttackBehaviour{
    HeroCharacter(int id,String name){
        super(id, name);
    }
    @Override
    public void attackTo(Character other){
        other.takeDamage(5);
        System.out.println("Hero character attacks"+other.barrier);
    }

    @Override
    void defense(){
        if(this.health < 100){
            this.health += 5;
        }
        else if(this.health >100){
            this.health = 100;
        }
    }
}
