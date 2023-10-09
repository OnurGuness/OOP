public class MonsterCharacter extends Character implements FireAttackBehaviour,AirAttackBehaviour{
    MonsterCharacter(int id, String name){
        super(id,name);
    }
    @Override
    public void fireAttackTo(Character other) {
        System.out.println("MonsterCharacter takes damages");
        other.takeDamage(50);
    }
    @Override
    public void airAttackTo(Character other){
        System.out.println("MonsterCharacter air attacks!");
        other.takeDamage(20);
    }
    @Override
    void defense(){
        System.out.println("MonsterCharacter defenses!");
        if(this.health<100){
            this.health += 100;
        }
        else if(this.health>100){
            this.health =100;
        }
    }
}
