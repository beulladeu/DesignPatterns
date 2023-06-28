package main.java.com.verkhonina.basepatterns.behavioral.chain;

public abstract class Enemy {
    int enemyType;
    private Enemy nextEnemy;

    public Enemy(int enemyType) {
        this.enemyType = enemyType;
    }

    public void setNextEnemy(Enemy nextEnemy) {
        this.nextEnemy = nextEnemy;
    }

    public void goFight(int prevEnemyType) {
        if (prevEnemyType >= enemyType) {
            fight();
        }

        if (nextEnemy != null) {
            nextEnemy.goFight(prevEnemyType);
        }

    }

    public abstract void fight();
}
