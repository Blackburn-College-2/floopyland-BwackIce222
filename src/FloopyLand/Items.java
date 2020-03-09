/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.Item;

/**
 * Implementation for the item class
 *
 * @author montr
 */
public abstract class Items extends Item {

    private String color;
    private String name;
    private String type;

    /**
     * Constructor for item
     *
     * @param name
     */
    public Items(String name) {
        super(name);
    }

}
