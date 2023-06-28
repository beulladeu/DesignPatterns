package main.java.com.verkhonina.basepatterns.behavioral.chain;

public class LevelRunner {
    public static void main(String[] args) {

        Enemy creep = new Creep(EnemyType.EASY);
        Enemy bossGuard = new BossGuard(EnemyType.MEDIUM);
        Enemy boss = new Boss(EnemyType.HARD);

        creep.setNextEnemy(bossGuard);
        bossGuard.setNextEnemy(boss);

        creep.goFight(EnemyType.EASY);
        creep.goFight(EnemyType.MEDIUM);
        creep.goFight(EnemyType.HARD);
    }
}
