package FloopyLand;

import com.pauliankline.floopyconnector.BaseHero;
import com.pauliankline.floopyconnector.GameSquare;
import com.pauliankline.floopyconnector.Item;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Initiates a unit region of the game map
 *
 * @author montr
 */
public class Square extends GameSquare {

    private ArrayList<Item> items;
    private ArrayList<BaseHero> heroesPresent;

    /**
     * Gets an ArrayList of heroes present in the game square
     *
     * @return an ArrayList of heroes
     */
    public ArrayList<BaseHero> getHeroesArePresent() {
        return heroesPresent;
    }

    /**
     * gets the items stored in an arrayList
     *
     * @return an ArrayList of items
     */
    @Override
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Adds heroes to an ArrayList
     *
     * @param hero
     * @return returns the value true if added successfully
     */
    public boolean addHero(BaseHero hero) {
        if (!hero.isDead()) {
            heroesPresent.add(hero);
            return true;
        }
        return false;
    }

    /**
     * removes the hero from the arraylist and gameboard
     *
     * @param hero
     * @return returns true if removed successfully
     */
    @Override
    public boolean removeHero(BaseHero hero) {
        heroesPresent.remove(hero);
        return true;
    }

    /**
     * Constuctor for the class
     */
    public Square() {

    }

    /**
     * adds an item to the arraylist of items
     *
     * @param i
     */
    @Override
    public void addItem(Item i) {
        items.add(i);

    }

    /**
     * determines if a square has items
     *
     * @return true if the spot has items and false if not
     */
    @Override
    public boolean hasItems() {
        boolean containsItems = false;
        if (items.isEmpty() == true) {
            containsItems = true;
        }
        return containsItems;
    }

    /**
     * returns the number of items in the arraylist
     *
     * @return number of items
     */
    public int numItems() {
        return items.size();
    }

    /**
     * determines if heroes are present on the gamesquare
     *
     * @return true if if the gameSquare has heroes and false if not
     */
    public boolean heroesArePresent() {
        boolean containsHeroes = false;
        if (heroesPresent.isEmpty() == true) {
            containsHeroes = true;
        }
        return containsHeroes;
    }
}
