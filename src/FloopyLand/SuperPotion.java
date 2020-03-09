/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyLand;

import com.pauliankline.floopyconnector.Item;

/**
 * A subclass of item
 *
 * @author montr
 */
public class SuperPotion extends Item {

    private String color = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp."
            + "com/f/d172d7b1-a7b9-4d76-9d62-b7e135be03a1/dbkdbue-67e841d2-cdcb"
            + "-4505-8273-2c3c49990415.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIU"
            + "zI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVh"
            + "MGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTV"
            + "lYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2QxNzJkN2IxLWE3YjktNGQ"
            + "3Ni05ZDYyLWI3ZTEzNWJlMDNhMVwvZGJrZGJ1ZS02N2U4NDFkMi1jZGNiLTQ1MD"
            + "UtODI3My0yYzNjNDk5OTA0MTUucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOm"
            + "ZpbGUuZG93bmxvYWQiXX0.6rfBgskArZNoC26JMyNRa8cxbhTFZpPIdGxU93h5i"
            + "y4";
    private String type = "Potion";
    private String name = "Super Potion";

    /**
     * Constructor for Super potion
     *
     * @param name
     */
    public SuperPotion(String name) {
        super(name);
    }

    /**
     * Super potion increases all of the heroes stats by 200%
     *
     * @param x
     */
    public void powerPlay(Hero x) {
        x.maxHp *= 2;
        x.maxDamage *= 2;
        x.inventorySize += 1;
    }

}
