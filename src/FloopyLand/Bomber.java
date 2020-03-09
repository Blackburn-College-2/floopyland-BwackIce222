/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;

/**
 * A subclass of hero. Bombers have a chance of inflicting different levels of
 * explosive damage to enemies
 *
 * @author montr
 */
public class Bomber extends Hero {

    private String color = "red";
    private String type = "Bomber";

    /**
     * Constuctor for bomber
     *
     * @param gameboard
     * @param location
     */
    public Bomber(GameBoard gameboard, Point location) {
        super(gameboard, location);
    }

    /**
     * Overrides the parent classes method for attacking
     *
     * @param x
     */
    @Override
    public void attackEnemy(Hero x) {
        double explosion = (100 * Math.random()) + 1;
        if (explosion <= 33) {
            x.recieveDamage(maxDamage);
            if (x.isDead()) {
                this.kills += 1;
            }
        } else if (33 < explosion && explosion <= 66) {
            x.recieveDamage((int) (maxDamage * 1.5));
            if (x.isDead()) {
                this.kills += 1;
            } else {
                x.recieveDamage((int) (maxDamage * 2));
                if (x.isDead()) {
                    this.kills += 1;
                }
            }
        }

    }
}
