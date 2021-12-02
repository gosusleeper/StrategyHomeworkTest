import java.util.HashMap;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: Extends Monster.java. A favorite companion of a warlock. Tends to fire fireballs.
 * Title: Imp.java
 **/

public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
    }

    @Override
    public String toString(){
        return "Imp has : " + super.toString();
    }
}
