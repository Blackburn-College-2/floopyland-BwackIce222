package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * A subclass of hero
 *
 * @author montr
 */
public class Thieves extends Hero {

    String type = "Thieves";
    String color = "Purple";

    /**
     * Constructor for thieves
     *
     * @param gameboard
     * @param location
     */
    public Thieves(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

    /**
     * Steals an item from the enemy and adds it to your inventory
     */
    public void stealItem() {
        this.inventory.add(this.enemy.inventory.get(1));
    }

}
