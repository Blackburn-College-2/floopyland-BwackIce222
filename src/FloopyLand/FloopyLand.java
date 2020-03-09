/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.Floopy;
import com.pauliankline.floopyconnector.GameController;
import com.pauliankline.floopyconnector.SocketServer;

/**
 * Implimentation for the floopyLand class
 *
 * @author montr
 */
public class FloopyLand extends Floopy {

    private GameController gameController;
    private SocketServer socket;

    /**
     * FloopyLand constructor
     *
     * @param x GameController
     */
    public FloopyLand(GameController x) {
        super(x);
        this.gameController = (Controller) x;
    }

    /**
     * Begins the program
     *
     * @param x
     */
    @Override
    public void begin(int x) {
        this.gameController.createHeroes(this.gameController.getGameBoard(), x);

    }

}
