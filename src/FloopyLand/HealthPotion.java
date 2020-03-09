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
public class HealthPotion extends Items {

    private String color = "https://vignette.wikia.nocookie.net/ageofmagicgame"
            + "/images/4/48/Experience_Potion.png/revision/latest?cb=2017091"
            + "5103844";
    private String type = "Potion";
    private String name = "Health Potion";

    /**
     * Health Potion constructor
     *
     * @param name
     */
    public HealthPotion(String name) {
        super(name);
    }

    /**
     * Health potion add 4 does of health to the hero's hp. 15hp per dose
     *
     * @param x
     */
    public void addHealth(Hero x) {
        x.hp += 15 * 4;
        if (x.hp > x.maxHp) {
            x.hp = x.maxHp;
        }
    }

}
