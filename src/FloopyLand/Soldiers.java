/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 * A subclass of hero. soldiers have an increased inventory size of 1
 *
 * @author montr
 */
public class Soldiers extends Hero {

    String type = "Soldier";
    String color = "Black";
    private int inventorySize = 4;

    /**
     * Soldier constructor
     *
     * @param gameboard
     * @param location
     */
    public Soldiers(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

}
