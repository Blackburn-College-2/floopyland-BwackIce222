/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 * A subclass of hero. Tankers have twice as much hp as other heroes
 *
 * @author montr
 */
public class Tankers extends Hero {

    String type = "Tanker";
    String color = "Blue";
    int hp = 200;
    int maxhp = 200;

    /**
     * Constructor for Tankers
     *
     * @param gameboard
     * @param location
     */
    public Tankers(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

}
