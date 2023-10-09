public class Main {
    public static void main(String[] args) {

        Character heroCharacter = new HeroCharacter(1,"Hero");
        Character enemy;

        GollumCharacter gollum = new GollumCharacter(2,"Gollum");
        MonsterCharacter monster = new MonsterCharacter(3,"Monster");
        MonsterCharacter monster2 = new MonsterCharacter(4,"Monster2");

        Character[] enemies = {gollum,monster,monster2};
        int index =0;
        enemy = enemies[0];

        while(heroCharacter.isAlive && enemy.isAlive){
            if (heroCharacter instanceof AttackBehaviour){
                ((AttackBehaviour)heroCharacter).attackTo(enemy);
                enemy.defense();
            }
            if (enemy instanceof AirAttackBehaviour){
                ((AirAttackBehaviour)enemy).airAttackTo(heroCharacter);
                heroCharacter.defense();
            }
            if(!enemy.isAlive && index<enemies.length)
                enemy = enemies[index++];
        }

    }
}