/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.GameBoard;
import com.pauliankline.floopyconnector.GameSquare;
import java.awt.Point;

/**
 * Implementation of multiple squares making up the Gameboard class
 *
 * @author montr
 */
public class Board extends GameBoard {

    private GameBoard gameboard;
    private GameSquare[][] board;
    private Point point;

    /**
     * GameBoard constructor
     *
     * @param width
     * @param height
     */
    public Board(int width, int height) {
        board = new GameSquare[width][height];
    }

    /**
     * GameBoard default constructor
     */
    public Board() {
        board = new GameSquare[10][10];
    }

    /**
     * returns a gameSquare object depending on the location passed in
     *
     * @param p
     * @return the square object
     */
    public Square getGameSquare(Point p) {
        this.point = p;
        return (Square) board[p.x][p.y];
    }

    /**
     * gets the width of the gameBoard
     *
     * @return the number of Square objects
     */
    public int getWidth() {
        return board.length;
    }

    /**
     * gets the height of the gameboard
     *
     * @return the number of Square objects
     */
    public int getHeight() {
        return board[0].length;
    }

    /**
     * gets a location on the gameboard
     *
     * @return coordinates of the position
     */
    public Point getPoint() {
        return this.point;
    }
}
