package GameSettings;

public class Main {
    static void main(String[] args) {
        GameSettings gameSettings = new GameSettings("NFS");
        GameSettings gameSettings1 = new GameSettings("Dota 2");

        gameSettings.addPlayer();
        gameSettings.addPlayer();
        gameSettings1.addPlayer();

        GameSettings.setMaxPlayers(5);

        gameSettings.printGameStatus();
        gameSettings1.printGameStatus();

        GameSettings.setMaxPlayers(10);

        gameSettings.printGameStatus();
        gameSettings1.printGameStatus();
    }
}
