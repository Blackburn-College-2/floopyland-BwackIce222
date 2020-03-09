/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 * A subclass of hero. Ninjas are able to evade 25% of all incoming damage
 *
 * @author montr
 */
public class Ninjas extends Hero {

    String type = "Ninja";
    String color = "white";

    /**
     * Constructor for ninja
     *
     * @param gameboard
     * @param location
     */
    public Ninjas(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

    /**
     * Overrides the parent class's method to enable ninjas to evade damage
     *
     * @param i
     */
    @Override
    public void recieveDamage(int i) {
        this.hp -= (i * 0.75);
    }
}
