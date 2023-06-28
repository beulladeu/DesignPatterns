package main.java.com.verkhonina.basepatterns.behavioral.iterator;

public class Team implements Collection {

    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public Iterator getIterator() {
        return new PlayerIterator();
    }

    private class PlayerIterator implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            return index < players.length;
        }

        @Override
        public Player next() {
            return players[index++];
        }
    }

}
