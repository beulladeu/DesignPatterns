package main.java.com.verkhonina.basepatterns.behavioral.iterator;

public class IteratorRunnable {
    public static void main(String[] args) {

        Player[] players = {
                new Player("John"),
                new Player("Tony"),
                new Player("Jake")
        };

        Team team = new Team("Team№1", players);

        Iterator iterator = team.getIterator();

        while (iterator.hasNext()) {
            Player next = (Player) iterator.next();
            next.heal();
        }
    }
}
