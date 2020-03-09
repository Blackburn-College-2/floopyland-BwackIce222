/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 * A subclass of hero
 *
 * @author montr
 */
public class Healers extends Hero {

    String type = "Healer";
    String color = "Green";

    /**
     * Healer constructor
     *
     * @param gameboard
     * @param location
     */
    public Healers(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

    /**
     * Attack method for healer which overrides its parent class to reflect
     * their special ability
     *
     * @param x
     */
    @Override
    public void attackEnemy(Hero x) {
        x.recieveDamage(10);
        if (this.hp <= 97.5) {
            this.hp += 0.25 * 10;
        }
    }

}
