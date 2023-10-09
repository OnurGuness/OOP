public class GollumCharacter extends Character implements AirAttackBehaviour{
    GollumCharacter(int id,String name){
        super(id,name);
    }
    @Override
    public void airAttackTo(Character other){
        other.takeDamage(30);
    }
    @Override
    void defense(){
        if(this.health<100){
            this.health += 5;
        }
        else if(this.health > 100){
            this.health = 100;
        }
    }
}
