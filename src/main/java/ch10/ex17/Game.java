package ch10.ex17;

import java.util.Random;

interface Games {
    void play();
}

interface GamesFactory {
    Games getGame();
}

class CoinGames implements Games {

    Random random = new Random();

    public void play() {
        System.out.println("play coin game");
        switch (random.nextInt(2)) {
            case 0 : System.out.println("Heads"); return;
			case 1 : System.out.println("Tails"); return;
			default: System.out.println("OnEdge"); return;
        }
    }

    public static GamesFactory factory = new GamesFactory() {
        public Games getGame() {
            return new CoinGames();
        }
    };
}

class DiceGames implements Games {

    Random random = new Random();

    public void play() {
        System.out.println("Dice Game: " + (random.nextInt(6) + 1));
    }

    public static GamesFactory factory = new GamesFactory() {
        public Games getGame() {
            return new DiceGames();
        }
    };
}

public class Game {

    public static void playGame(GamesFactory factory) {
        Games game = factory.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(CoinGames.factory);
        playGame(DiceGames.factory);
    }
}