package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: The super class of the monsters. Responsible for xp, hp, and items.
 * Title: Monsters.Monster.java
 **/

public abstract class Monster {

    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    Integer agility;
    Integer defense;
    Integer strength;
    Attack attack;

    public Monster(Integer maxHP, Integer xp,  HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;

        this.agility = 10;
        this.defense = 10;
        this.strength = 10;
    }

    boolean takeDamage(Integer damage){
        if (damage > 0) {
            setHp(getHp() - damage);
            System.out.println("The creature was hit for "+damage+" damage");

            if(getHp()<=0){
                System.out.println("Ohn no! the creature has perished");
            }

            System.out.println(this);
        }

        if (hp>0) {
            return true;
        }
        else{
            return false;
        }
    }

    public Integer attackTarget(Monster target){

        Integer damageValue = this.attack.attack(target);
        //call takeDamage(integer) method of the creature
        target.takeDamage(damageValue);
        return 5;
    }

    /**
     * Returns an integer  value between min and max.
     * @param min an integer
     * @param max an integer
     * @return a random integer between min and max
     */
    Integer getAttribute(Integer min, Integer max) {
        //initiate random
        Random rand = new Random();
        //check min is greater than max, swap min with max
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        //return random number between min and max inclusive
        return rand.nextInt(max-min)+min;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getStrength() {
        return strength;
    }

    public Attack getAttack() {
        return attack;
    }

    //new override and hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) && Objects.equals(xp, monster.xp) && Objects.equals(maxHP, monster.maxHP) && Objects.equals(items, monster.items) && Objects.equals(agility, monster.agility) && Objects.equals(defense, monster.defense) && Objects.equals(strength, monster.strength) && Objects.equals(attack, monster.attack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items, agility, defense, strength, attack);
    }

    @Override
    public String toString() {
        return  "hp=" + hp +
                "/" + maxHP; }
}

