package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: Extends Monsters.Monster.java. A favorite companion of a warlock. Tends to fire fireballs.
 * Title: Monsters.Imp.java
 **/

public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);

        //store in hashmap later
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        //make data structure
        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString(){
        return "Monsters.Imp has : " + super.toString();
    }
}
