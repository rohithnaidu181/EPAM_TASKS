package com.corejava;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score in descending order
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        } else {
            // If scores are the same, compare by name alphabetically
            return a.name.compareTo(b.name);
        }
    }
}

