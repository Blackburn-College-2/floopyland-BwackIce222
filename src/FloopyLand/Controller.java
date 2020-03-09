package FloopyLand;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameController;
import java.awt.Point;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Implementation for the controller class
 *
 * @author montr
 */
public class Controller extends GameController {

    private GameBoard gameboard;
    private ArrayList<BaseHero> hero;

    /**
     * Controller constructor
     */
    public Controller() {
        this.gameboard = this.mkGameBoard();
    }

    /**
     * Creates a number of heroes to be placed on the gameboard
     *
     * places heroes randomly on gameboard.
     *
     * @param gb
     * @param quantity
     * @return an ArrayList of heroes.
     */
    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard gb, int quantity) {
        for (int i = 0; i < quantity; i++) {
            int x = (int) (10 * Math.random() + 1);
            int y = (int) (10 * Math.random() + 1);
            Point p = new Point(x, y);
            Hero[] heroes = {new Healers(gb, p), new Tankers(gb, p),
                new Thieves(gb, p), new Ninjas(gb, p), new Soldiers(gb, p),
                new Bomber(gb, p)};
            heroes = new Hero[quantity - 1];
            int g = (int) (quantity * Math.random());
            gameboard.getGameSquare(p).addHero(heroes[g]);
            hero.add(heroes[g]);
        }

        return hero;
    }

    /**
     * Makes GameBoard
     * <p>
     * Creates a new GameBoard of the designated parameters<p>
     * @return GameBoard object
     */
    @Override
    public GameBoard mkGameBoard() {
        gameboard = new GameBoard(15, 15);
        return gameboard;
    }

    /**
     * begins the creation of heroes
     *
     * @param x
     */
    @Override
    public void begin(int x) {
        createHeroes(gameboard, x);

    }

    /**
     * gets the gameboard currently being worked on
     *
     * @return
     */
    @Override
    public GameBoard getGameBoard() {
        return gameboard;
    }

}
