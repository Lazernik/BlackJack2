package com.company;

/**
 * Created by student2 on 14.11.16.
 */

import java.util.LinkedList;
public class Hand extends LinkedList<Card> {
    public int getscore() {
        int sum=0;
        for(Card c:this)
            sum+= c.getScore();
        if(this.hasAce() && sum+10<=21)
            sum +=10;
        return sum;
    }

    private boolean hasAce() {
        for (Card c: this)
            if (c.value==Value.ACE)
         return true;
                return false;
    }
}
