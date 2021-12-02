
/**
 * Name: David DeBow
 * Date: 12/2/2021
 * Explanation: Class for up close attacks. Implements the attack interface. Claims membership to Ability.
 * File Name: MeleeAttack.java
 **/

public class MeleeAttack implements Attack{

    Monster attacker;

    public MeleeAttack(Monster attacker){
        this.attacker = attacker;
    }


    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
