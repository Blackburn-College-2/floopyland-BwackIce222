/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * The two lines of code necessary for running the program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FloopyLand floop = new FloopyLand(new Controller());
        floop.begin(8);

    }

}
