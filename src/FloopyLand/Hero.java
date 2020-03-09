/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import java.awt.Point;
import java.util.ArrayList;

/**
 * Implementation for the base hero class
 *
 * @author montr
 */
public abstract class Hero extends BaseHero {

    protected int hp = 100;
    protected int kills;
    protected int maxHp = 100;
    protected int maxDamage = 10;
    protected int inventorySize = 0;
    protected ArrayList<Items> inventory;
    public String name;
    public String type;
    public String color;
    protected Point location;
    public Hero enemy;
    public int gameTick = 0;

    /**
     * Creates a generic hero object
     *
     * @param gameboard
     * @param location
     */
    public Hero(GameBoard gameboard, Point location) {
        super(gameboard, location);
        this.gameboard = gameboard;
        this.location = location;
        this.gameboard.getGameSquare(location);

    }

    /**
     * Determines if the current hero is in battle or not
     *
     * @return
     */
    @Override
    public boolean isInBattle() {
        boolean isinBattle = false;
        if (gameboard.getGameSquare(location).getHeroesPresent().size() > 1) {
            isinBattle = true;
        }
        return isinBattle;

    }

    /**
     * retrieves the enemy located at your location
     *
     * @return the name of the enemy
     */
    @Override
    public String enemy() {
        return gameboard.getGameSquare(this.location).getHeroesPresent().
                get(2).toString();

    }

    /**
     * Logic for the hero to use to navigate through FloopyLand
     *
     * @param l
     */
    @Override
    public void gameTickAction(long l) {
        for (this.gameTick = 0; this.gameTick < 100; this.gameTick++) {
            if (this.isInBattle()) {
                this.yourEnemy();
                this.attackEnemy(enemy);
            } else {
                int x = location.x;
                int y = location.y;
                x += 1;
                y += 1;
                if (x > 10) {
                    x = (int) (10 * Math.random()) + 1;
                }
                if (y > 10) {
                    y = (int) (10 * Math.random()) + 1;
                }
                Point p = new Point(x, y);
                location = p;
                if (gameboard.getGameSquare(location).hasItems() && inventory
                        .size() < inventorySize) {
                    inventory.add((Items) gameboard.getGameSquare(location).
                            getItems().get(0));
                }
            }
            if (this.gameboard.getGameSquare(location).heroesArePresent()) {
                this.attackEnemy(enemy);
            }
        }

    }

    /**
     * Kills the hero, once defeated in battle
     */
    @Override
    protected void die() {
        this.location = null;
    }

    /**
     * Determines if the hero is dead
     *
     * @return the state of the hero, alive(false) or dead(true)
     */
    @Override
    public boolean isDead() {
        if (hp == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Attacks the enemy located in your gamesquare
     *
     * @param x
     */
    public void attackEnemy(Hero x) {
        x.recieveDamage(maxDamage);
        if (x.isDead()) {
            this.kills += 1;
        }

    }

    /**
     * receive damage from your enemy
     *
     * @param i
     */
    public void recieveDamage(int i) {
        this.hp -= i;
    }

    /**
     * returns this hero's name
     *
     * @return the name of the hero
     */
    @Override
    public String toString() {
        return this.name;
    }

    /**
     * Determines who your enemy is that is located within the gamesquare
     */
    public void yourEnemy() {
        this.enemy = (Hero) gameboard.getGameSquare(location).
                getHeroesPresent().get(2);
    }

}
