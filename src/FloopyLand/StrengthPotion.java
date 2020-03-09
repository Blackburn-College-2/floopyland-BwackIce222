/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

/**
 * A subclass of Item
 *
 * @author montr
 */
public class StrengthPotion extends Items {

    private String color = "https://cdn3.vectorstock.com/i/1000x1000/55/97/blue"
            + "-aqua-potion-with-bubbles-vector-19995597.jpg";
    private String type = "Potion";
    private String name = "Strength Potion";

    /**
     * Constructor for Strength Potion
     *
     * @param name
     */
    public StrengthPotion(String name) {
        super(name);
    }

    /**
     * Increased the heroes strength by 440%
     *
     * @param x
     */
    public void boostStrength(Hero x) {
        x.maxDamage *= 1.1 * 4;
    }
}
