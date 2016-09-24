package com.excilys.formation.battleships;

import java.io.Serializable;
import java.util.List;

public class AIPlayer extends Player {
    private BattleShipsAI ai;
    public AIPlayer(Board ownBoard, Board opponentBoard, List<AbstractShip> ships) {
        super(ownBoard, opponentBoard, ships);
        ai = new BattleShipsAI(ownBoard, opponentBoard);
    }

    // TODO AIPlayer must not inherit "keyboard behaviour" from player. Call ai instead.
}