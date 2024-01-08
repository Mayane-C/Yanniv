package fr.pantheonsorbonne.miage.engine.local;

import fr.pantheonsorbonne.miage.engine.AlternateTurnGame;
// I don't understand the meaning of this class
public class GameLocal extends AlternateTurnGame {
    public GameLocal() {
        super();
    }

    public static void main(String... args) {

        GameLocal localWarGame = new GameLocal();
        localWarGame.start();
        System.exit(0);
    }

}
