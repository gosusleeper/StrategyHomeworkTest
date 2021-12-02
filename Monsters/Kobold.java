package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: Extends Monsters.Monster.java. A bad rat like guy that isn't too tough to beat.
 * Title: Monsters.Kobold.java
 **/

public class Kobold extends Monster{

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
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
        return "Monsters.Kobold has : " + super.toString();
    }
}
