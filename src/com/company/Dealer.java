package com.company;

import java.util.LinkedList;

/**
 * Created by student2 on 14.11.16.
 */
public class Dealer extends Computer {
    public Dealer(LimitIntellect intellect, String name) {
        super(intellect, name);
    }

    Deck deck = new Deck();


    public void deal(Player player) {
        Card current = deck.pop();
        player.take(current);
    }
}
