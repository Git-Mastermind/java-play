package com.datastructures.BattleshipGame;

import java.util.List;
import java.util.ArrayList;

public class Battleships {
    String name;
    int length;
    List<String> position = new ArrayList<>();
    

    public Battleships(String battleshipName, int battleshipLength) {
        this.name = battleshipName;
        this.length = battleshipLength;
    }

    
}
