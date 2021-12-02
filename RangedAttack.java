public class RangedAttack implements Attack{

    Monster attacker;

    /**
     * Name: David DeBow
     * Date: 12/2/2021
     * Explanation: Class for distant attacks. Implements the attack interface. Claims membership to Ability.
     * File Name: RangedAttack.java
     **/

    public RangedAttack(Monster attacker){
        this.attacker = attacker;
    }


    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return null;
    }
}