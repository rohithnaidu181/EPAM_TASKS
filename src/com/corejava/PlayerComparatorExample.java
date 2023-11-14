package com.corejava;

import java.util.Arrays;

public class PlayerComparatorExample {
    public static void main(String[] args) {
        Player[] players = {
            new Player("Vigneshwaran", 100),
            new Player("adhav", 50),
            new Player("dhruv", 75),
            new Player("Virat", 75)
        };

        Arrays.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
