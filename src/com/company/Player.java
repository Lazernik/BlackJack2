package com.company;

/**
 * Created by student2 on 14.11.16.
 */
public abstract class Player {
    State state = State.IN_GAME;
    String name;
    Hand hand = new Hand();
 private Intellect intellect;
    public Player(Intellect intellect, String name) {
        this.intellect=intellect;
        this.name = name;
    }

 public void take(Card current) {
  hand.add(current);
 }

 public Command decision() {
  int score=hand.getscore();
   if (score>21)
       return Command.STAND;
  return intellect.decide(score);
 }
}
