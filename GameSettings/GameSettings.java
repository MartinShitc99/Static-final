package GameSettings;

public class GameSettings {
    static int maxPlayers;
    final  String gameName;
    int currentPlayers;

    public GameSettings(String someGameName) {
        this.gameName = someGameName;
        this.currentPlayers = 0;
    }

    public static void setMaxPlayers(int newLimit) {
        maxPlayers = newLimit;
    }

    public void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Name game: " + gameName + "; Current players: " + currentPlayers + "; Max players: " + maxPlayers);
    }
}
