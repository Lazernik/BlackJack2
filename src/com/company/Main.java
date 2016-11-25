package com.company;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();

        players.add(new LimitIntellect(14);
        players.add(new Computer( new LimitIntellect(14)));
        players.add(new Human());
        Dealer dealer = new Dealer();
        players.add(dealer);

        for(Player player: players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);
        }

        for(Player player: players){
            while(true){
                System.out.println();
                Command command = player.decision();
                if(command == Command.STAND)
                    break;
                if (command == Command.HIT)
                    dealer.deal(player);
                for(Player player: players)
                    if(player = dealer)
                        if (player.hand.getscore()>21)
                            player.state=State.DEFEAT;




            }
        }
    }

}
