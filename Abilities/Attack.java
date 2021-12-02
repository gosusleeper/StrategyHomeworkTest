package Abilities;

import Monsters.Monster;

/**
 * Name: David DeBow
 * Date: 12/2/2021
 * Explanation:  Interface attack extends ability.
 * File Name: Abilities.Attack.java
 **/

public interface Attack extends Ability {

    public Integer attack(Monster target);
}
