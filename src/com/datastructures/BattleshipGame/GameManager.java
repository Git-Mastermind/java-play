package com.datastructures.BattleshipGame;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {

    List<Battleships> battleships = new ArrayList<>();
    Random random = new Random();
    private List<String> stringOptionsForPosition = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
    private List<String> numberOptionsForPosition = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6"));

    public GameManager() {
        Battleships battleship1 = new Battleships("Aircraft Carrier", 5);
        battleships.add(battleship1);

        Battleships battleship2 = new Battleships("Destroyer", 3);
        battleships.add(battleship2);

        Battleships battleship3 = new Battleships("Boat", 2);
        battleships.add(battleship3);
    }

    public void randomizePositions() {
        List<String> position = new ArrayList<>();
        for (int i = 0; i < battleships.size(); i++) {
            int randomStringIndex = random.nextInt(stringOptionsForPosition.size());
            String randomString = stringOptionsForPosition.get(randomStringIndex);
        }
        
    }  

}
