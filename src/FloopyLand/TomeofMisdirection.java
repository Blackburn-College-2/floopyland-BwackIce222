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
public class TomeofMisdirection extends Items {

    private String color = "https://wizardsunitehub.info/wp-content/uploads/"
            + "2019/06/ui_registry_mysteries01_pg01_sticker06.png";
    private String type = "Potion";
    private String name = "Tome of Misdirection";

    /**
     * Constructor for the Tome of Misdirection
     *
     * @param name
     */
    public TomeofMisdirection(String name) {
        super(name);
    }

    /**
     * Method mirror magic deflects 10% of all incoming damage back to the
     * attacker
     *
     * @param x
     * @param dmg
     */
    public void mirrorMagic(Hero x, int dmg) {
        x.recieveDamage((int) (dmg * 0.9));
        x.maxDamage = (int) (0.1 * dmg);
        x.attackEnemy(x);
        x.maxDamage = 10;
    }

}
